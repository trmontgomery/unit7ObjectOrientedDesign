import java.util.Scanner;
public class Person implements Comparable<Person>
{
    private String name;
    
    public Person(String name)
    {
        this.name = name;
    }
    
    public int compareTo(Person p)
    {
        return this.name.compareTo(p.name);
    }
    
    public static Person firstPerson(Person[] people)
    {
        Person p = people[0];
        
        for (int i = 0; i < people.length; i++)
        {
            if(p.compareTo(people[i] > 0)
            {
                
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Person[] people = new Person[10];
        for (int i = 0; i < 10; i++)
        {
            System.out.println("Input person name " + i +": ");
            Person p = new Person(in.next());
            people[i] = p;
        }
        
        if (people[0].compareTo(people[9]) < 0)
        { 
            System.out.println(people[0].name + " is first");
        }
        else if (people[0].compareTo(people[9]) > 0)
        {
            System.out.println(people[9].name + " is first");
        }
        else
        {
          System.out.println("Names are the same.");  
        }
    }

}
