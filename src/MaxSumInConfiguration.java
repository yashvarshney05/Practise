//https://practice.geeksforgeeks.org/problems/max-sum-in-the-configuration/1
public class MaxSumInConfiguration {
    public static void main(String[] args)
    {
        int a[]={8,3,1,2};
        int i=0;
        int j= 0;
        int n=a.length;int max=0;
        while (n>0) {
            int temp=a[0];
            for( i=0;i<a.length-1;i++)
            a[i]=a[i+1];
            a[a.length-1]=temp;
            n--;
            for(int k=0;k<a.length;k++)
                System.out.print("a[k]==="+a[k]);
            int res=getSum(a);
            System.out.println("res=="+res);
            if(max<res)
                max=res;
            System.out.println("max=="+max);
            }



    }

    private static int getSum(int a[])
    {
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i]*i;
        }
        return sum;
    }

}
