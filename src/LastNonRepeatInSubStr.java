import java.util.HashMap;
import java.util.LinkedHashMap;

//https://www.geeksforgeeks.org/queries-to-find-the-last-non-repeating-character-in-the-sub-string-of-a-given-string/
public class LastNonRepeatInSubStr {

    private static String lastNonRepeatChar(String s)
    {
        char minChar='\0';
        LinkedHashMap<Character,Integer>map= new LinkedHashMap<>();
        for(int i=0;i<s.length();i++)
        {
            int count=0;
            if(map.containsValue(s.charAt(i))) {
                count=map.get(s.charAt(i));
                map.put(s.charAt(i),count++);
            }
            map.put(s.charAt(i),1);
        }

        for(HashMap.Entry<Character,Integer> entry:map.entrySet())
        {
           if(entry.getValue()==1)
               minChar=entry.getKey();
        }
        System.out.println("minChar=="+minChar);
        if(minChar=='\0')
            return "-1";
       return minChar+"";
    }

    private static void generateSubStringOfFixedLenght(String s)
    {
        int k=3;
        for(int i=0;i<s.length()-k;i++)
        {


                String sub = s.substring(i, i+k);
                System.out.println("sub==" + sub);

        }
    }

    public static void main(String[] args)
    {
        String s = "xxyyxx";
        String test="yashvrttt";
        generateSubStringOfFixedLenght(test);
        int q[] = {2, 3, 3, 4};
        for(int i=0;i<q.length-1;i=i+1)
        {
           // System.out.println("q[i]==before"+q[i]);
            String sub=s.substring(q[i],q[++i]);
            //System.out.println("q[i]==after"+q[i]);
            //System.out.println("substring=="+sub);
           // System.out.println(lastNonRepeatChar(sub));
        }
    }
}
