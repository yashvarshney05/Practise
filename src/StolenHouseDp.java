//https://www.geeksforgeeks.org/find-maximum-possible-stolen-value-houses/

public class StolenHouseDp {

    public static void main(String [] args)
    {
        int a[] = {6, 7, 1, 3, 8, 2, 4};
        System.out.println(findMaxLoot(a));
    }

    private static int findMaxLoot(int a[])
    {

        int n=a.length;
        if(n==0) return 0;
        if(n==1) return 1;
        if(n==2)
            return Math.max(a[0],a[1]);
        int dp[]=new int[n];
        dp[0]=a[0];
        dp[1]=Math.max(a[0],a[1]);
        for(int i=2;i<a.length;i++)
        {
            dp[i]=Math.max(a[i]+dp[i-2],dp[i-1]);
        }
        return dp[n-1];
    }
}
