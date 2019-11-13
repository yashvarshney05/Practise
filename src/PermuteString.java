import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class PermuteString {

    public static void main(String []args)
    {
        String s = "ABC";
        Set<String> list = permute(s);

            System.out.println(list);

    }

    private static Set<String> permute(String s)
    {
        Set<String> list = new HashSet<String>();
        if(s== null)
            return null;
        if(s.length()==1) {
            list.add(s);
            return list;
        }
        char firstChar=s.charAt(0);
        String rem=s.substring(1);
        System.out.println("rem=="+rem);
        Set<String> words=permute(rem);
        for(String newString: words)
        {
            System.out.println("newString=="+newString);
            System.out.println("firstChar==="+firstChar);
            for (int i = 0; i <= newString.length(); i++) {
                System.out.println("i=="+i);
                list.add(crunchifyCharAdd(newString, firstChar, i));
            }
        }
        return list;
    }

    public static String crunchifyCharAdd(String str, char c, int j) {
        String first = str.substring(0, j);
        String last = str.substring(j);
        return first + c + last;
    }
}
