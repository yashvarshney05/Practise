import java.util.HashMap;

public class LongestEvenWord {

    public static String longestEvenWord(String sentence) {
        // Write your code here
        if(sentence.length()==0 || null == sentence)
            return "00";
        String [] s= sentence.split("\\s+");
        int max_length=0;String result="";
        HashMap<String,Integer>map=new HashMap<>();
        for(int i=0;i<s.length;i++)
        {
            if((s[i].length())%2==0)
            {
                if(s[i].length()>max_length)
                {
                    max_length=s[i].length();
                    result=s[i];
                }
            }

        }
        if(result!="")
        return result;
        return "00";

    }

    public static void main(String [] args)
    {
        System.out.println(longestEvenWord("It is a pleasant day today"));
    }
}
