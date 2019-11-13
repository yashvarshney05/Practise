import java.util.Arrays;
import java.util.HashMap;

//https://practice.geeksforgeeks.org/problems/longest-consecutive-subsequence/0
public class LongestConsecutiveSubsequence {
    final public static void main(String[] args)
    {

        int a[]={1, 9, 3 ,10, 4, 20, 2};
        int max=getMax(a);
        int min=getMin(a);
        HashMap<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<a.length;i++)
        {
            map.put(a[i],i);
        }
        int c=0,res=0;
        for(int i=min;i<=max;)
        {
            while(map.containsKey(i++))
                c++;
            if(c>res)
                res=c;
            c=0;
        }
        System.out.println("res=="+res);
       /* Arrays.sort(a);
        int pre=a[0];int count=1,max=0;
        for(int i=1;i<a.length;i++)
        {
            while(a[i]==pre+1) {

                count++;
               // System.out.println("count="+count);
                pre=a[i];
                i++;
            }
            if(count>max)
                max=count;

        }*/
        //System.out.println("max=="+max);
    }

    private static int getMin(int[] a)
    {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]<min)
                min=a[i];
        }
        return min;
    }

    private static int getMax(int[] a)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
                max=a[i];
        }
       return max;
    }

    private static void solveWithMap(int[] a)
    {

    }
}
