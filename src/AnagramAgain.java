import java.util.Arrays;

public class AnagramAgain {

    public static boolean isAnagram(String s, String t) {
        char[]c=s.toCharArray();
        Arrays.sort(c);
        System.out.println(c.toString());
        char[]d=t.toCharArray();
        Arrays.sort(d);
        System.out.println(d.toString());
        if(String.valueOf(c).equals(String.valueOf(d)))
            return true;
        return false;

    }

    public static void main(String[] args)
    {
        System.out.println(isAnagram("anagram","nagaram"));
    }
}
