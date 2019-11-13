//https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/maximize-the-earning-137963bc-323025a6/

import java.util.Scanner;

public class Maximize_earning {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        int a[]= new int[2];
        for(int k=0;k<t;k++) {
            for (int i = 0; i < a.length; i++) {
                a[i] = sc.nextInt();
            }

            int number_of_buildings = a[0];
            int cost = a[1];
            int b[] = new int[a[0]];

            for (int j = 0; j < a[0]; j++) {
                b[j] = sc.nextInt();
            }

            int res = getLeaders(b);
            System.out.println(cost * res);
        }
    }

    private static int getLeaders(int[] a)
    {
        int max_from_left=a[0];
        int count=1;
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max_from_left) {
                max_from_left = a[i];
                ++count;
            }
        }
        System.out.println("count==="+count);
        return count;
    }
}
