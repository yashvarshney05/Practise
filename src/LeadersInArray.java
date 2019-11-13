public class LeadersInArray {

    public static void main(String[] args)
    {
        equal_sum();
    }

    private static void leaders_in_array()
    {
        int a[]={16, 17, 4, 3, 5, 2};
        int max_from_right=a[a.length-1];
        System.out.println(a[a.length-1]);
        for(int i=a.length-2;i>=0;i--)
        {
            if(a[i]>max_from_right)
            {
                System.out.println(a[i]);
                max_from_right=a[i];
            }
        }
    }

    private static void equal_sum()
    {
        int a[]={1, 4, 2, 5};
        int sum_from_left=a[0];
        int sum_from_right=0;
        int i=0,j=a.length-1;
        for( i=0;i<a.length;i++)
            sum_from_right=sum_from_right+a[i];
        for(i=0,j=1;i<a.length;i++,j++)
        {
            sum_from_left+=a[i];
            sum_from_right-=a[j];
            if(sum_from_left==sum_from_right)
            {
                System.out.println("i=="+i);
                break;
            }

        }
    }
}
