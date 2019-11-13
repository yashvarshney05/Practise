import java.util.Arrays;

public class MinimumDiffBetweenArray {

    public static void main(String[] args)
    {
        int a[]={87, 32, 99, 75, 56, 43, 21, 10, 68, 49};
        Arrays.sort(a);
        int min=Integer.MAX_VALUE;
        int diff=0,res=0;
        for(int i=1;i<a.length;i++)
        {
            diff=a[i]-a[i-1];
            res=Math.min(min,diff);
            min=res;
           // System.out.println("res=="+res);
        }
        System.out.println("res=="+res);
    }
}
