import javax.print.DocFlavor;
import java.util.Stack;

//https://leetcode.com/problems/decode-string/
public class DecodeString {
    static StringBuilder sb = new StringBuilder();

    public static void decodeString(String s) {

        Stack<Integer> countStack = new Stack<>();
        Stack<Character> resStack = new Stack<>();
        for (int i = 0; i <s.length(); i++) {
            int count = 0;
            System.out.println("s.charAt(i)==" + s.charAt(i));


             if (Character.isDigit(s.charAt(i))) {
                count = 10 * count + (s.charAt(i) - '0');
                countStack.push(Integer.valueOf(count));
            }
            else {
                System.out.println("pushing char is =="+s.charAt(i));
                 resStack.push(s.charAt(i));
             }
        }

        System.out.println("resStack.size()=="+resStack.size());
       while (!resStack.isEmpty())
            System.out.println("resStack.pop()==="+resStack.pop());
        popFromStack(countStack,resStack);

    }

    private static void popFromStack(Stack<Integer> countStack, Stack<Character> resStack) {
        int count=0;
        while (!resStack.isEmpty() || !countStack.isEmpty()) {
            StringBuilder c = new StringBuilder();
            while (!resStack.isEmpty()) {
                char x = resStack.pop();
                System.out.println("x===" + x);
                if(x=='[')
                    break;
                if (Character.isAlphabetic(x))
                    c = c.append(x);

                System.out.println("c===" + c);
            }
            c = c.reverse();
             count = countStack.pop();
            System.out.println("count==" + count);
            int k = 0;
            while (k < count) {
                sb = sb.append(c);
                k++;
            }
        }
        System.out.println("sb==" + sb);
    }

    public static void main(String[] args)  {
        String s = "3[a2[c]]";
       decodeString(s);
    }
}