import java.util.Arrays;

public class RotateArrayKTimes {
    public static void main(String[] args)
    {
        int a[]={1,2,3,4,5};
        int n=2;
        reverse(a,0,n);
        reverse(a,n+1,a.length-1);
        reverse(a,0,a.length-1);
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]);
    }
    private static int[] reverse(int a[],int first,int last)
    {
      int temp=0;
        while(first<last)
        {
            temp=a[first];
            a[first]=a[last];
            a[last]=temp;
            first++;
            last--;
        }
        return a;
    }

}
