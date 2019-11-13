

public class Binary {

    private static void printBinary(int num)
    {
        int b[]=new int[16];
        int k=0;
        while(num>0)
        {
            int rem=num%2;
            b[k]=rem;
            num=num/2;
            k++;
        }
        for(int i=b.length-1;i>=0;i--)
            System.out.print(b[i]);

    }

    public static void main(String[] args)
    {
        printBinary(5);
    }
}
