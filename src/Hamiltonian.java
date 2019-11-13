//https://www.hackerearth.com/practice/data-structures/arrays/1-d/practice-problems/algorithm/hamiltonian-and-lagrangian/

import com.sun.javafx.scene.control.skin.VirtualFlow;


import java.util.LinkedHashSet;
import java.util.Scanner;

public class Hamiltonian {

    private static void leaders(int a[])
    {
        int b[]=new int[a.length];int k=0;
        int size=a.length-1;
        int max_from_right=a[size];
        b[k]=max_from_right;
        for(int i=size-1;i>=0;i--)
        {
            if(a[i]>=max_from_right) {
                max_from_right = a[i];
                k++;
                b[k]=max_from_right;

            }
        }

        for(int i=k;i>=0;i--)
            System.out.print(b[i]+" ");


    }

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int t=sc.nextInt();

        int a[]=new int[t];
        for(int i=0;i<t;i++)
            a[i]=sc.nextInt();
        leaders(a);
    }
}
