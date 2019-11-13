import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//https://leetcode.com/problems/find-all-anagrams-in-a-string/
public class AnagramIndex {
    public  static  List<Integer> findAnagrams(String s, String p) {
        int len=p.length();
        ArrayList<Integer>list=new ArrayList<>();
        char c[]=p.toCharArray();
        Arrays.sort(c);
        String p1=String.valueOf(c);
        for(int i=0;i<s.length();i++)
        {
            for(int j=i+len;j<s.length();j=j+len) {
                String s1 = s.substring(i, j);
                System.out.println("s1=="+s1);
                char c1[] = s1.toCharArray();
                Arrays.sort(c1);
                String s2 =String.valueOf(c1);
                System.out.println("s2=="+s2);
                if (p1.equals(s2))
                    list.add(j-i);

            }
        }
        return list;
    }

    public static void main(String [] args)
    {
        List<Integer>list=findAnagrams("cbaebabacd","abc");
        for(int i=0;i<list.size();i++)
            System.out.println(list.get(i));
    }
}
