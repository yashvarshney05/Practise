import java.util.HashSet;
import java.util.Set;

public class PalindromSubstring {

    public static void main(String[] args) {
        String s="aassdf";
        Set<String> set=new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
           for(int j=i+1;j<s.length();j++)
           {
               String sub=s.substring(i,j);
               System.out.println("sub==="+sub);
               if(isPalindrom(sub)) {
                   set.add(sub);
               }
           }

        }
     System.out.println(set);

    }

    private static boolean isPalindrom(String s)
    {
       int i=0;
       int j=s.length()-1;
       while(i<=j)
       {
           if(s.charAt(i)!=s.charAt(j))
               return false;
           i++;j--;
       }
       return true;
    }

}
