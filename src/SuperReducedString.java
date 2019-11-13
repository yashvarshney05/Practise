public class SuperReducedString {

    public static void main(String args[]) {

       /*String s="aaabccdddfff";
        char c[]=s.toCharArray();
        char pre=c[0];
        StringBuilder sb= new StringBuilder();
        int count=0;
        sb.append(c[0]);
        for(int i=1;i<c.length;i++)
        {
            while(i<c.length-1 && pre==c[++i]  ) {
                count++;
            System.out.println("count=="+count);
            System.out.println("pre=="+pre);
            System.out.println("c[i]=="+c[i]);

            }
            if(count%2!=0)
                sb.append(c[i]);
            count=0;
            if(i<c.length-1)
            pre=c[i+1];

        }
        if(c[c.length-1]==sb.charAt(sb.length()-1))
            sb.deleteCharAt(sb.length()-1);
        System.out.println(sb.toString());

        System.out.println(IsStringRotation("abcd","bdca"));*/
        reduced();
    }

    private static boolean IsStringRotation(String s1,String s2)
    {
        if(s1.length()!=s2.length())
            return false;
        String temp=s1+s1;
        if(temp.contains(s2))
            return true;
        return false;
    }

    private static void reduced()
    {
        String s="aaabccbb";
        char c[]=s.toCharArray();
        StringBuilder sb= new StringBuilder();
        char pre=c[0];
       int count=1;
        for(int i=1;i<c.length;i++) {
            if(pre==c[i])
                count++;
            else {
                   sb=sb.append(pre);
                if (count > 1)
                    sb = sb.append(count);
                count = 1;

                pre = c[i];
                System.out.println("pre==" + pre);
            }
        }
        sb=sb.append(pre);
        sb=sb.append(count);

        System.out.println(sb);
    }
}
