import apple.laf.JRSUIConstants;
import com.sun.tools.javac.util.List;

import java.util.HashSet;
import java.util.Set;

public class LongestSubtring {

    public static int lengthOfLongestSubstring(String s) {

        int n=s.length();
        int i=0,j=0,ans=0;
        Set<Character> set=new HashSet<Character>();
        while(i<n && j<n)
        {
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                System.out.println(set);
                ans=Math.max(ans,j-i);
            }
            else
                set.remove(s.charAt(i++));

        }
        return ans;

    }

    public static void main(String[] args)
    {
        int res=lengthOfLongestSubstring("abcabcbb");
        System.out.println("res=="+res);
    }
}
