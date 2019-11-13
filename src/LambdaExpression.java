import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class LambdaExpression {

    public static void main(String args[]) {
        // Creating an ArrayList with elements
        // {1, 2, 3, 4}
        ArrayList<Integer> arrL = new ArrayList<Integer>();
        arrL.add(1);
        arrL.add(2);
        arrL.add(3);
        arrL.add(4);
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(1,2);map.put(2,3);
        map.forEach((a,b)->System.out.println("key=="+a+"val=="+b));
        //HashMap<Integer,Integer>sorted=map.entrySet().stream().sorted(Map.Entry.comparingByValue()),

        arrL.forEach(n -> System.out.println(n));
        arrL.forEach(n-> {if(n%2==0) System.out.println(n);});

        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6");
        List<Integer>list=numbers.stream().map(s->Integer.valueOf(s)).filter(n->n%2==0).collect(Collectors.toList());
        list.forEach(x-> System.out.println(x));
    }

    private static void listExmaple()
    {
        int a[]={1,2,3,4};

    }
    }
