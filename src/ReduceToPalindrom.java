//https://www.geeksforgeeks.org/minimum-reduce-operations-covert-given-string-palindrome/
//https://www.geeksforgeeks.org/minimum-swaps-required-to-make-a-binary-string-alternating/

public class ReduceToPalindrom {
    public static void main(String args[]) {
        String s="ccc";
        int res=0;
        int i=0,j=s.length()-1;
        while (i<=j)
        {
            res=res+s.charAt(j--)-s.charAt(i++);

        }
        System.out.println(res);
        minimumSwap();
    }

    private static void minimumSwap()
    {
        String s="000111";
        int one_odd=0,one_even=0,zero_odd=0,zero_even=0;
        for(int i=0;i<s.length();i++) {
            if (i % 2 == 0) {
                if (s.charAt(i) == '1')

                    one_even++;
                else
                    zero_even++;
            } else {

                if (s.charAt(i) == '1')

                    one_odd++;
                else

                    zero_odd++;
            }
        }
        System.out.println("one_even=="+one_even+"one_odd=="+one_odd);
        System.out.println("zero_even=="+zero_even+"zero_odd=="+zero_odd);
       System.out.println(Math.min(Math.min(one_even,zero_odd),Math.min(one_odd,zero_even)));
    }
}
