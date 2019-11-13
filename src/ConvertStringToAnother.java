//https://www.geeksforgeeks.org/minimum-number-of-given-operations-required-to-convert-a-string-to-another-string/
public class ConvertStringToAnother {

    public static void main(String args[]) {

        String s1="011",s2="101";
        int cnt_zero=0,cnt_one=0;
        for(int i=0;i< s2.length();i++)
        {
            if(s1.charAt(i)==s2.charAt(i))
                continue;;


                    if(s1.charAt(i)==0)
                        cnt_zero++;
                    else
                        cnt_one++;
        }
        System.out.println(Math.max(cnt_one,cnt_zero));
    }

}
