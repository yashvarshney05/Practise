import java.util.Arrays;

//https://practice.geeksforgeeks.org/problems/count-occurences-of-anagrams/0
public class CountAnagram {
    public static void main(String [] args) {
        String s = "forxxorfxdofr";
        String t = "for";int count=0;
        int x = t.length();
        for (int i = 0; i+x-1 < s.length(); i++) {
            String sub = s.substring(i, i + x);
            System.out.println("t=="+t+"sub=="+sub);
             if(checkAnagram(t,sub))
                 count++;

        }
        System.out.println(count);
        System.out.println( count(10));
    }

        private static boolean checkAnagram(String t,String sub)
        {
            char c[]=t.toCharArray();
            Arrays.sort(c);
            char c1[]=sub.toCharArray();
            Arrays.sort(c1);
           for(int i=0;i<c.length;i++)
           {
             if(c[i]!=c1[i])
                 return false;
        }
        return true;

    }

    static int count(int n)
    {
        // table[i] will store count of solutions for
        // value i.
        int table[] = new int[n + 1], i;

        // Initialize all table values as 0
        Arrays.fill(table, 0);

        // Base case (If given value is 0)
        table[0] = 1;

        // One by one consider given 3
        // moves and update the table[]
        // values after the index greater
        // than or equal to the value of
        // the picked move
        for (i = 3; i <= n; i++) {
            table[i] += table[i - 3];
            System.out.println("table[i]=="+table[i]);
        }

        for (i = 5; i <= n; i++) {
            table[i] += table[i - 5];
            System.out.println("table[i]=="+table[i]);
        }
        for (i = 10; i <= n; i++) {
            table[i] += table[i - 10];
            System.out.println("table[i]=="+table[i]);
        }

        return table[n];
    }
}
