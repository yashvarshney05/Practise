public class CountFreqoencyAgain {
    public static void main(String[] args)
    {
        String s="aaadrrfddd";
        char c=s.charAt(0);
        StringBuilder sb= new StringBuilder();
        int count=1;int i=1;
        for( i=1;i<s.length();i++)
        {
           if(c==s.charAt(i)) {
               count++;
           }
           else {
               sb = sb.append(c);
               System.out.println("c=="+c);
               if (count > 1) {
                   sb = sb.append(count);
               }
               System.out.println("count=="+count);
               count=1;
               c=s.charAt(i);
           }


        }
        System.out.println("c=="+c);
        System.out.println("count=="+count);
        sb.append(c);
        sb.append(count);
        System.out.println(sb.toString());
    }

}
