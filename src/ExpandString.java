//https://www.geeksforgeeks.org/java-program-expand-string-range-given/

import java.util.ArrayList;
import java.util.List;

public class ExpandString {
    static List<String> list=new ArrayList<>();

    public static void main(String [] args)
    {
        String x = "1-5, 8, 11-14, 18, 20, 26-29";
        String []s=x.split(",");
        for(int i=0;i<s.length;i++)
        {
            makeList(s[i]);
        }
        System.out.println("list=="+list);
        String s1="yash";
        System.out.println(s1.substring(0,1));
    }

    private static void makeList(String s)
    {
        if(!s.contains("-"))
            list.add(s);
        else {
            String[] a = s.split("-");
            System.out.println("a[0]=="+a[0]);
            int x = Integer.valueOf(a[0].trim());
            int y=Integer.parseInt(a[1].trim());
            list.add(String.valueOf(x));
            int z=x+1;
            while(z<=y)
            {
                list.add(String.valueOf(z));
                z++;
            }
        }
    }


}
