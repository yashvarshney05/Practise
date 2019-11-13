//https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/pepper-and-contiguous-even-subarray-9f3adf65/

import java.util.Scanner;

public class Subarray {


    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();
        int a[]=new int[t];
        for(int i=0;i<t;i++)
        {
            a[i]= sc.nextInt();
        }
        int res=getLength(a);
        System.out.println(res);
    }

    private static int getLength(int[] a)
    {
        int len=0,max=0;
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+i;j<a.length-1;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    if(a[k]%2!=0)
                        break;
                    else
                    {
                       len=j-i+1;
                    }
                }
            }
        }
      if(len>max)
          return len;
      else
          return max;
    }


}
