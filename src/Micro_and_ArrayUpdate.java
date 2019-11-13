// https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/micro-and-array-update/

import java.util.Arrays;
import java.util.Scanner;

public class Micro_and_ArrayUpdate {

    private static void rotate(int a[],int k)
    {

        int diff,max=0;
        for(int i=0;i<a.length;i++)
        {
           if(a[i]<k) {
               diff = k - a[i];
               if(diff==0)
               {
                   break;
               }
               if(diff>max)
                   max=diff;
           }
        }
        System.out.println(max);
    }

    private static void rotate(int a[])
    {

    }
    public static void main(String args[])
    {

        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        while(t>0) {
            int sample[] = new int[2];
            for (int i = 0; i < sample.length; i++)
                sample[i] = sc.nextInt();
            int a[] = new int[sample[0]];
            for (int j = 0; j < sample[0]; j++)
                a[j] = sc.nextInt();
            rotate(a, sample[1]);
            t--;
        }

    }



}

