import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/word-pattern/
public class WordPattern {
    public static boolean wordPattern(String pattern, String str) {

        Map map1=new HashMap();

        String []a=str.split(" ");
        if(pattern.length()!=a.length)
            return false;
        for(int i=0;i<pattern.length();i++)
        {
            if(map1.put(pattern.charAt(i),i)!=map1.put(a[i],i)) {
                System.out.println(map1.get(pattern.charAt(i)));
                System.out.println(map1.get(a[i]));
                return false;
            }
        }
     return true;


    }

    public static void getUtf(String s) throws Exception
    {
        byte[]a=s.getBytes("UTF-8");
        for(byte b:a)
        {
            System.out.println(b);
        }
    }



    public static void main(String [] args) throws Exception
    {
        String pattern =  "ccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccccdd",
        str= "s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s s t t";
         getUtf("\\uFFFF");

        //System.out.println(pattern.length()+"==="+str.length());

        //String pattern = "abba",
               // str = "dog cat cat dog";
      // System.out.println(wordPattern(pattern,str));
    }
}

