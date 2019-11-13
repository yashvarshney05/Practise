//https://www.geeksforgeeks.org/count-ways-reach-nth-stair-using-step-1-2-3/
public class MaxStairs {
    public static void  main(String []args)
    {
        System.out.println(countWays(4));
    }

    private static int countWays(int n)
    {
        int res[]=new int[n+1];
        res[0]=1;
        res[1]=1;
        res[2]=2;
        for(int i=3;i<=n;i++)
        {
            res[i]=res[i-3]+res[i-2]+res[i-1];
        }
        return res[n];
    }
}
