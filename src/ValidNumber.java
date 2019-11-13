public class ValidNumber {

    private static boolean checkNumber(String s)
    {
        if(s.matches("\\d+"))
            return true;
        if(s.length()==1 && s.equals("e"))
            return true;
        if(s.matches("[a-zA-Z]+[<e>]+"))
            return false;
        return false;

    }

   public static void main(String[] args)
   {
       System.out.println(checkNumber("11.0"));
   }
}
