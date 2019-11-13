//https://leetcode.com/problems/house-robber/

public class houseRobber {

    public static void main(String[] args) {
        int a[]={2,7,9,3,1};
        System.out.println(houseRobber(a));

    }
    private static int houseRobber(int[] a)
    {
        int max=0,sum1=0,sum2=0;
        for(int i=0;i<a.length;)
        {

        }

        if(sum1>sum2)
            return sum1;
        return sum2;
    }
}
