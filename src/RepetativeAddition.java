public class RepetativeAddition {

    public static void main(String[] args)
    {
        int num= 1234;


       int res=getSum(num);
      // break;
        System.out.println(res);
     }




    private static int getSum(int num)
    {


        int rem=0,div=0,sum=0;
        while(num>0 || sum>9)
        {
            if(num==0)
            {
                num=sum;
                sum=0;
            }
            rem=num%10;
            sum=sum+rem;
            num=num/10;

        }
        return sum;
    }
}
