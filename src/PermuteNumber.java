public class PermuteNumber {

   static int x=0;
   private static int count(int n)
   {
       int c =0;
       while(n>0)
       {
           int rem=n%10;
           c++;
           n=n/10;
       }
       return c;
   }
   private static void permute(int num,int k)
   {
        if(k<=0) {
            System.out.println("Invalid range");
            System.exit(0);
        }
       int temp=num;
       int n=count(num);
       while(true)
       {

          //
           int rem=temp%10;
           int div=temp/10;
            temp=(int)(Math.pow(10,n-1)*rem+div);
           // System.out.println("temp=="+temp);
            int temp_count=count(temp);
             if(temp_count!=count(num))
                 continue;
           System.out.println(temp);
             //System.out.println("temp_count=="+temp_count);
             //System.out.println("count(num)=="+count(num));
            x++;
           if(temp==num) {

               break;
           }
          // System.out.println("x=="+x);
           if(x==k)
               break;
       }
   }

    public static void main(String []args)
    {

        permute(67890,-1);
    }

}
