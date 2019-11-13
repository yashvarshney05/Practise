public class TrailingZero {

    public static void main(String[] args)
    {
        int n=5;
       /* int fact=1;
        while(n>0)
        {
            fact=fact*n;
            n--;
        }
        System.out.println("fact=="+fact); */
        System.out.println(countTrailingZero(n));
    }

    private static int countTrailingZero(int n)
    {
         String s=String.valueOf(n);
         int j=s.length()-1;
         int count=0;
         System.out.println("s.charAt(j)=="+s.charAt(j));
        for (int i = 5; n / i >= 1; i *= 5)
            count += n / i;
        return count;
    }
}
