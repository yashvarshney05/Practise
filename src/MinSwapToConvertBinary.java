//https://www.geeksforgeeks.org/minimum-swaps-required-to-convert-one-binary-string-to-another/
public class MinSwapToConvertBinary {

    public static void main(String args[]) {
        String str1 = "1101", str2 = "1110";
        int count=0;
        for(int i=0;i<str1.length();i++)
        {
            if(str1.charAt(i)!=str2.charAt(i))
                count++;

        }
        if(count%2==0)
            System.out.println(count/2);
        else
            System.out.println("Nope");
    }
}
