import java.util.*;
import java.util.stream.Collectors;

public class SortMapByValue {
    public static void main(String [] args)
    {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(1,2);
        map.put(2,5);map.put(3,4);
        HashMap<Integer,Integer>sorted=map.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors
                .toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        for(Integer val:sorted.values())
            System.out.println(val);

    }

}
