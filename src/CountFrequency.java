import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CountFrequency {

    public static void main(String[] args)
    {
        String s="aaaabb";
        char c= maxFrequency(s);
        System.out.println(c);
    }

    private static char maxFrequency(String s)
    {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            int count=0;
            if(map.containsKey(s.charAt(i)))
                 count =map.get(s.charAt(i));
            count++;
            map.put(s.charAt(i),count);

        }
        int x= Collections.max(map.values());
        for(Map.Entry<Character,Integer> e:map.entrySet())
        {
               if(e.getValue().equals(x))
                   return e.getKey();

        }

        return '1';
    }

}
