import java.util.Scanner;

public class ATM_Queue {

    private static void  countGroup(int a[])
    {
        boolean flag= false;int count=0,finalCount=0,max=0;
        for(int i=0;i<a.length-1;i++)
        {
           if(a[i]<a[i+1])
           {
               count++;
           }
            finalCount=count-i;
           if(max>finalCount)
               finalCount=max;
        }
        System.out.println(count);
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        countGroup(a);
    }
}
