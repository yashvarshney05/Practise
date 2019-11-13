//https://leetcode.com/problems/maximum-product-subarray/

public class Max_Product_SubArray {

    private static int getMaxProduct(int[] a)
    {
        int f_index=0,l_index=0,pro=1,max=0;
        for(int i=0;i<a.length;i++)
        {

            for(int j=i+1;j<a.length;j++)
            {
                pro=1;
                for(int k=i;k<j;k++) {
                    pro = pro * a[k];
                }
                    if(pro>max)
                    {
                        max=pro;
                        f_index=i;
                        l_index=j;
                    }

            }
        }
        return max;
    }

    public static void main(String[] args)
    {
        int a[]={2,3,-2,4};
        System.out.println(getMaxProduct(a));
    }
}
