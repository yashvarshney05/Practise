//https://www.geeksforgeeks.org/find-kth-character-of-decrypted-string/
public class KthCharOfString {
    static StringBuilder sb= new StringBuilder();
    public static void main(String[] args)
    {
        String s="a2b2c3";

        int k=5;
        int f_index=0;
        int l_index=0;
       // System.out.println("first=="+f_index);
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                l_index=i;
               // System.out.println("last=="+l_index+"f_index=="+f_index);
               // System.out.println("first=="+f_index+"last==="+l_index);
                sb=decodeString(s,f_index,l_index,k,getNumber(s.charAt(l_index)));
                f_index=l_index+1;
            }


        }
        System.out.println(sb.toString().charAt(k));
     foo(5);

    }
     private static int getNumber(char c)
     {
         int count =0;
         return count*10+(c-'0');
     }
    private static StringBuilder  decodeString(String s,int f_index,int l_index,int k,int digit) {
        //System.out.println("digit===="+digit);
        String sub = s.substring(f_index, l_index);
        while(digit>0) {
            sb = sb.append(sub);digit--;
        }
       // System.out.println("sb inside===="+sb);

        return sb;
    }

    private static char printChar(String s)
    {
        int sum=0;
        for(int i=0;i<s.length();i++)
        {
            sum=sum+getNumber(s.charAt(i));
        }
        if(sum%26==0)
            return 'z';
        return (char)('a'+(sum%26));
    }


     public  static int foo(int n)
     {
         if(n==0) return 0;
         System.out.println(n);

         return (foo(--n));

     }

}
