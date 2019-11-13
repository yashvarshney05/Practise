//https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/not-in-range-44d19403/
import sun.awt.AWTIcon32_security_icon_yellow16_png;

import java.util.Arrays;
import java.util.Scanner;

public class Not_In_range {

    static int sum=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int l[] = new int[t];
        int r[] = new int[t];
        for (int i = 0; i < t; i++) {
            l[i] = sc.nextInt();
            r[i] = sc.nextInt();

        }
        int c[]=new int[l.length+r.length];
     int i=0,k=0;
     while(i<l.length)
     {
         c[k]=l[i];
         k++;i++;
     }
        while(i<r.length)
        {
            c[k]=r[i];
            k++;i++;
        }
        Arrays.sort(c);

    }







}
