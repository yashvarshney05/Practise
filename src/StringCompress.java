public class StringCompress {

    public static void main(String[] args)
    {
        String s="aaabbdccdddd";
        int count=1;
        char[] c= s.toCharArray(); // a,a,a,b,b,b,d,c,c,c,d,d
        StringBuilder sb= new StringBuilder();
        char pre=c[0]; //a
        for(int i=1;i<c.length;i++)
        {
            if(pre==c[i])
                count++; //2 3
            else {
                sb.append(pre); //a
                System.out.println("pree1==="+pre);
                if (count > 1)
                    sb = sb.append(count);//3
                pre = c[i]; //b
                System.out.println("pre 2==="+pre);
                count=1;

            }

        }
        sb.append(pre);
        if(count>1)
            sb.append(count);
        System.out.println(sb.toString());
    }
}
