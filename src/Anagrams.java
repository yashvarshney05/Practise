import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Anagrams {

    public static  List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>>map=new HashMap<>();

        String key=sortChar(strs[0]);
        map.put(key, new ArrayList<>());
        map.get(key).add(strs[0]);
        for(int i=1;i<strs.length;i++)
        {
             key=sortChar(strs[i]);
            System.out.println("key=="+key);
            if(map.containsKey(key)) {
                map.get(key).add(strs[i]);
            }
            else {
                map.put(key, new ArrayList<>());
                map.get(key).add(strs[i]);
            }
        }
        return new ArrayList<>(map.values());

    }

    private static String sortChar(String s)
    {
        char[]c=s.toCharArray();
        Arrays.sort(c);
        return String.valueOf(c);
    }

    public static void main(String[] args)
    {
        String[]s={"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> list=groupAnagrams(s);
        for(int i=0;i<list.size();i++)
            System.out.println(list.get(i));

    }

}
