import java.math.BigInteger;

public class MultiplyString {

    public static void main(String []args)
    {
      System.out.println(multiply("123456789","987654321"));
    }

    public static String multiply(String s1,String s2)
    {
        int a=convertToNumber(s1);
        System.out.println("a=="+a);
        int b=convertToNumber(s2);
        System.out.println("b=="+b);
        BigInteger mult=BigInteger.valueOf(a).multiply(BigInteger.valueOf(b));
        return String.valueOf(mult);
    }

    private static int convertToNumber(String s)
    {
        char[] c=s.toCharArray();
        int count=0;
        for(int i=0;i<c.length;i++)
        {
            count=count*10+(c[i]-'0');
        }
        return count;
    }
}
