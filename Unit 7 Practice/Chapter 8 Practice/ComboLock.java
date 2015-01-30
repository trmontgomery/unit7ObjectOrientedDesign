import java.util.Scanner;

/**
 * Write a description of class ComboLock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ComboLock
{
   int num1;
   int num2;
   int num3;
   int pos;
   int guess1;
   int guess2;
   int guess3;
   public ComboLock( int secret1, int secret2, int secret3 )
   {
       num1 = secret1;
       num2 = secret2;
       num3 = secret3;
   }
   public void reset() 
   {
       pos = 0;
    }
   public void turnLeft( int ticks ) 
   {
       if (pos - ticks < 0 )
       {
           pos = 40 - (ticks - pos);
       }
       else
       {
           pos = pos - ticks;
       }
       
       pos = guess2;
       
    }
   public void turnRight( int ticks ) 
   {
       int rememberPos = pos;
       
       if (pos + ticks > 40 )
       {
           pos = (ticks + pos) - 40;
       }
       else
       {
           pos = pos + ticks;
       }
       
       
       if (rememberPos == guess2)
       {
           pos = guess3;
       }
       else
       {
          pos = guess1;
       }
       
    }
   public boolean open() 
   {
       if ((guess1 == num1 )&& (guess2 == num2) && (guess3 == num3))
       {
           return true;
        }
       else
       {
           return false;
        }
    }
   
   
   public static void main(String args[])
   {
       
       
       ComboLock test = new ComboLock(5,2,12);
       
       test.reset();
       Scanner in = new Scanner(System.in);
       
       System.out.println("Turn Right:  ");
       test.turnRight(in.nextInt());
      
       
       System.out.println("Turn Left:  ");
       test.turnLeft(in.nextInt());
      
       
       System.out.println("Turn Right:  ");
       test.turnRight(in.nextInt());
      
       
       System.out.println(test.open());
       System.out.println(test.guess1 + " " + test.guess2 + " " + test.guess3);
    }
}
    