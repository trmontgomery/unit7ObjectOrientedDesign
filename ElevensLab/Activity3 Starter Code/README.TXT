Questions:
1. Write a static method named flip that simulates a flip of a weighted coin by returning either
"heads" or "tails" each time it is called. The coin is twice as likely to turn up heads as tails.
Thus, flip should return "heads" about twice as often as it returns "tails."

public static String flip()
{
   String coin = "";
   int num = (int)(Math.random()*3);
   if (num == 0 || num == 1)
   {
       coin = tails;
   }
   else
   {
       coin = heads;
   }
   return coin;
    
}

2. Write a static method named arePermutations that, given two int arrays of the same length
but with no duplicate elements, returns true if one array is a permutation of the other (i.e., the
arrays differ only in how their contents are arranged). Otherwise, it should return false.

public static arePermutations(int[] a, int[] b)
{
    //organize each array in numerical order and then compare them
    for (int i = 0; i < a.length; i++)
    {
        if (a[i] > a[i+1})
        {
            int temp = a[i];
            a[i] = a[i+1];
            a[i+1] = temp;
        }
        if (b[i] > b[i+1})
        {
            int temp = b[i];
            b[i] = b[i+1];
            b[i+1] = temp;
        }
    }
    return Arrays.equals(a,b);
}


3. Suppose that the initial contents of the values array in Shuffler.java are {1, 2, 3,
4}. For what sequence of random integers would the efficient selection shuffle change values to
contain {4, 3, 2, 1}?


//4 values[3] switches with 1 values[0] and then 3 values [2] switches with 2 values [1]

3,0,2,1















