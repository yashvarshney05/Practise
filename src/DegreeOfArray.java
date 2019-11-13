import java.util.*;

public class DegreeOfArray {

    public static void main(String[] args)
    {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);  list.add(2);   list.add(2);
        list.add(3);   list.add(1);   list.add(4);   list.add(2);


      int degree=degreeOfArray(list);
     System.out.println(degree);


    }



    public static int degreeOfArray(List<Integer> arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int degree = 1;
        for (Integer id : arr) {
            int count = 0;
            if (map.containsKey(id)) {
                count = map.get(id);
            }
            count++;
            map.put(id, count);
            degree = Math.max(degree, count);
        }
        for(Integer key:map.keySet())
            System.out.println("key=="+key);
        map = new HashMap<>();
        int lastIndex = 1;
        for (int i = 0; i < arr.size(); i++) {
            int count = 0;
            if (map.containsKey(arr.get(i))) {
                count = map.get(arr.get(i));
            }
            count++;
            map.put(arr.get(i), count);
            if (count == degree) {
                lastIndex = i - arr.indexOf(arr.get(i)) + 1;
                break;
            }
        }
        return lastIndex;
    }
}




