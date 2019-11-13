public class MaxNonContiousSum {

    public static void main(String[] args)
    {
        int a[] = {5, 5, 10, 100, 10, 5};
        int in_sum=a[0];
        int ex_sum=0;
        int sum=0;
        for(int i=1;i<a.length;i++)
        {
            sum=(in_sum>ex_sum)?in_sum:ex_sum;
            in_sum=ex_sum+a[i];
            ex_sum=sum;
        }
        if(ex_sum>in_sum)
        System.out.println(ex_sum);
        else
            System.out.println(in_sum);
    }
}
