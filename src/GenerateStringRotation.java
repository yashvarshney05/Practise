

//https://www.geeksforgeeks.org/perfect-reversible-string/
public class GenerateStringRotation {
    public static void main(String [] args)
    {
      String s="geeks";
      String temp=s.concat(s);
      int len=s.length();
      for(int i=1;i<=len;i++)
      {
          String rotate=temp.substring(i,len);
          System.out.println("rotate=="+rotate);
          if(rotate==s) {
              System.out.println("count==" + i);
              break;
          }
         // System.out.println(findRotations(s));
      }

    }

    static int findRotations(String str)
    {
        // tmp is the concatenated string.
        String tmp = str + str;
        int n = str.length();

        for (int i = 1; i <= n; i++)
        {

            // substring from i index of original
            // string size.

            String substring = tmp.substring(i, str.length());
             System.out.println("substring==="+substring);
            // if substring matches with original string
            // then we will come out of the loop.
            if (str == substring)
                return i;
        }
        return n;
    }

}
