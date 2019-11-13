//https://www.geeksforgeeks.org/number-subarrays-product-sum-equal/
public class SubArrayEqualProductSum {

    static int x=100;
    public static void main(String []args)
    {
        SubArrayEqualProductSum c= new SubArrayEqualProductSum();
        SubArrayEqualProductSum.x++;
        int a[]={1,2,3};
        int pro=1;
        int sum=0;
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            pro=1;sum=0;
            pro=pro*a[i];
            sum=sum+a[i];
            if(pro==sum) count++;
            for(int j =i+1;j<a.length;j++)
            {
                System.out.println("pro=="+pro+"sum=="+sum );

                pro=pro*a[j];
                sum=sum+a[j];


            }
            if(pro==sum) count++;
        }
        System.out.println(count);
        check();
    }

    public static void check()
    {
        String s1 = new String("geeksforgeeks");
        String s2 = new String("geeksforgeeks");
        if (s1 == s2)
            System.out.println("Equal");
        else
            System.out.println("Not equal");
    }
}
