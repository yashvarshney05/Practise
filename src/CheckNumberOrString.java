public class CheckNumberOrString {
    public static void main(String[] args)
    {
        String s="123.9";
       if(countDigit(s))
           System.out.println("tru");
       else
           System.out.println("false");

    }
    private static boolean countDigit(String s)
    {
        for(int i=0;i<s.length();i++) {
            if (!Character.isDigit(s.charAt(i)))
                return false;
        }
        return true;
    }
    private static boolean check(String s)
    {
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
                return false;
            if(Character.isSpaceChar(s.charAt(i)))
                return false;
            String []c=s.split(".");
            if(c.length>2)
                return false;


        }
        return true;
    }
}
