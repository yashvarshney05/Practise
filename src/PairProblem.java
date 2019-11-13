import java.util.Arrays;

//https://www.geeksforgeeks.org/count-of-pairs-x-y-in-an-array-such-that-x-y/
public class PairProblem {
    public static void main(String [] args)
    {
        int a[]={2,4,3,1};
        Arrays.sort(a);
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]<a[j])
                    System.out.println(a[i]+"=="+a[j]);
            }
        }
    }
}
