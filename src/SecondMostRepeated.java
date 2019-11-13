import java.util.HashMap;

//https://practice.geeksforgeeks.org/problems/second-most-repeated-string-in-a-sequence/0
public class SecondMostRepeated {
    public static void main(String[] args)
    {
        checkString();
        removeabc();

    }
    private static void removeabc()
    {
      String s="aababc";
       int pos=0;
      StringBuilder sb=new StringBuilder();
      for(int i=0;i<s.length();i++)
      {
            int j=i+1;


              if ((s.charAt(i)=='a' && s.charAt(j)=='c')) {
                  i=i+2;
                  System.out.println("i awala==="+i);
                  System.out.println("j==="+j);
                  continue;
              }


             if(s.charAt(i)=='b')
             {
                 i=i+1;
                 sb = sb.append(s.charAt(i));
                 System.out.println("i b wala==="+i);
                 continue;
             }

                  System.out.println("i==="+i);
                  sb = sb.append(s.charAt(i));
                  System.out.println(sb.toString());



      }

    }

    private static void checkString()
    {
        String s1="yash";
        String s2="yash";
        System.out.println(s1==s2);

    }
}
