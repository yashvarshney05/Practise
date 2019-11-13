//  A -> bUll
// B-> cows
//1123
//0111
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class BullsAndCows {

    public static void main(String[] args)
    {
       String  secret = "1123", guess = "0111";
        //System.out.println(getHint(secret,guess));
        HashMap<Integer,Integer>map =new HashMap<>();
        map.put(1,1);map.put(1,2);
        for(Map.Entry entry:map.entrySet())
        {
            System.out.println(entry.getKey()+"==="+entry.getValue());
        }

    }

    public static String getHint(String secret, String guess) {

        int bulls = 0;
        int cows = 0;
        int[] numbers = new int[10];
        for (int i = 0; i<secret.length(); i++) {
            int s = Character.getNumericValue(secret.charAt(i));
            System.out.println("s=="+s);
            int g = Character.getNumericValue(guess.charAt(i));
            System.out.println("g=="+g);
            if (s == g) bulls++;
            else {
                if (numbers[s] < 0) cows++;
                System.out.println("numbers[s]=="+numbers[s]);
                if (numbers[g] > 0) cows++;
                System.out.println("numbers[g]=="+numbers[g]);

                numbers[s] ++;
                numbers[g] --;
            }
        }
        return bulls + "A" + cows + "B";

    }


    }
