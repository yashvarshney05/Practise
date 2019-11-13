//https://leetcode.com/problems/reverse-words-in-a-string/

public class ReverseStringInWords {



    private static String reverse(String s)
    {
        StringBuilder sb= new StringBuilder();
        String[] a=s.split("\\s+");
        for(int i=a.length-1;i>=0;i--) {
            sb = sb.append(a[i]);
            sb.append(" ");
        }
       return sb.toString().trim();
    }

    public static void main(String[] args)
    {
        String s="  hello world!  ";
        System.out.println(reverse(s));
    }
}
