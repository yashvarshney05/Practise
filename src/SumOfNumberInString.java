import sun.jvm.hotspot.jdi.IntegerValueImpl;
import sun.plugin.net.protocol.jar.CachedJarURLConnection;

//https://practice.geeksforgeeks.org/problems/sum-of-numbers-in-string/0
public class SumOfNumberInString {

    public static void  main(String []args)
    {
        String s="1abc2x30yz67";
        char[] c=s.toCharArray();
        int count=0,res=0;
        for(int i=0;i<c.length;i++)
        {
            while(i<c.length&&Character.isDigit(c[i]))
            {

                count=count*10+(c[i]-'0');
                i++;
            }
            res=res+count;
            count=0;
        }
        System.out.println("res=="+res);
    }
}
