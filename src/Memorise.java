//https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/memorise-me/

import java.util.HashMap;
import java.util.Scanner;

public class Memorise {

    public static void checkNumber(HashMap<Integer,Integer> map,int a)
    {

          if(map.containsKey(a))
              System.out.println(map.get(a));
          else
              System.out.println("NOT PRESENT");
    }


    public static void main(String args[]) throws Exception
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        int choice=sc.nextInt();

        HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!map.containsKey(arr[i]))
                map.put(arr[i],1);
            else
            {
                int x=map.get(arr[i]);
                map.put(arr[i],++x);
            }

        }

        while (choice>0)
        {
            int find=sc.nextInt();
            checkNumber(map,find);
            choice--;
        }

    }
}
