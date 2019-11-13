public class ArrayRepeat2 {
    public static void main(String[] args)
    {
        int a[]={1, 3, 4, 4, 5, 3};
        int max=max(a);
        for(int i=1;i<a.length;i++)
        {
            if(a[i]==a[i-1])
                a[i]=max+1;
           // max=max+1;
        }
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

    }

    private static int max(int []a)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
                max=a[i];
        }
        return max;
    }
}
