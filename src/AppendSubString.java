

public class AppendSubString {
    public static void main(String[] args)
    {
        String s="code";
        String result="";
        for(int i=0;i<s.length()+1;i++)
        {

                result = result + s.substring(0, i);
                System.out.println("result==" + result);
            }


    }
}
