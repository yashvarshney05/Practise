//https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/help-jarvis-8a39566e/

import java.util.Arrays;
import java.util.Scanner;

public class Help_Jarvis {

    private static String checkJarvis(int coach_number)
    {
        String s= String.valueOf(coach_number);
        int a[]=new int[s.length()];
        int k=0;
       while(coach_number>0)
       {
          int div=coach_number%10;
          a[k]=div;
          if(k<s.length()-1)
              break;
          k++;
          System.out.println("k=="+k);
           coach_number=coach_number/10;
       }
       Arrays.sort(a);
        for(int i=0;i<a.length-1;i++)
        {
            System.out.println(a[i]);
        }
       for(int i=0;i<a.length-1;i++)
       {
           int diff = Math.abs(a[i] - a[i + 1]);
           if(diff>1)
               return "NO";
       }
       return "YES";
    }

    static void pairwiseDifference(int arr[])
    {
        int diff;
        int n=arr.length;
        for (int i = 0; i < n - 1; i++) {

            // absolute difference between
            // consecutive numbers
            diff = Math.abs(arr[i] - arr[i + 1]);
            System.out.print(diff+" ");
        }
    }


    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++) {

            int coach_number=sc.nextInt();

            String result =checkJarvis(coach_number);
            System.out.println(result);
        }
    }
}
