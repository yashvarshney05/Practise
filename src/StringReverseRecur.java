public class StringReverseRecur {

    public static void main(String[] args)
    {
        System.out.println(reverse("abs"));
    }

    private static String reverse(String s)
    {
        String res="";
        int len=s.length();
        if(s== null)
            return null;
        if(s.length()==1) return s;
        res=res+(s.charAt(len-1))+reverse(s.substring(0,len-1));
        return res;
    }
}
