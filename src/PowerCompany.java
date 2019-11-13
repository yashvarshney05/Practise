import java.util.*;

public class PowerCompany {

    public static int reduceCapacity(List<Integer> model) {
        // Write your code here
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<model.size();i++)
        {

                int count=0;
                if(map.containsKey(model.get(i)))
                    count =map.get(model.get(i));
                count++;
                map.put(model.get(i),count);
        }
       /* for(Map.Entry<Integer,Integer>entry:map.entrySet())
        {
            System.out.println(entry.getKey()+"=="+entry.getValue());
        }*/
        //System.out.println("model.size()=="+model.size());
        double half=Math.ceil(model.size()/2);
       // System.out.println("half=="+half);
        int generator=0;
        int sum=0;

        Integer a[]=new Integer[map.size()];
        int i=0;
        for(int val:map.values())
        {
            a[i]=val;i++;
        }
        Arrays.sort(a,Collections.reverseOrder());
       /* for( i=0;i<a.length;i++)
        {
            System.out.println("");
        } */
        for( i=0;i<a.length;i++)
        {
            if(sum<=half)
            {
                sum=sum+a[i];
                //System.out.println("sum=="+sum+"a[i]=="+a[i]);
                generator++;
            }
        }

       return generator;
    }

    public static void main(String [] args)
    {
        List<Integer>list= new ArrayList<>();
        list.add(3); list.add(4); list.add(6);list.add(11);
        list.add(9); list.add(9); list.add(9);list.add(9);
        list.add(8);list.add(8);list.add(8);list.add(8);list.add(8);list.add(8);
        System.out.println(reduceCapacity(list));
    }
}
