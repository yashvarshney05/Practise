//https://www.geeksforgeeks.org/minimum-operations-required-to-convert-a-binary-string-to-all-0s-or-all-1s/
public class BinaryString_1 {
    public static void main(String args[]) {
        String s="0011101010";
        int count=0;
        for(int i=0;i<s.length()-1;i++)
        {
            System.out.println("s.charAt(i)=="+s.charAt(i));
            if ( s.charAt(i)!=s.charAt(i+1))
                count++;
        }
        System.out.println(count/2);
    }
}
