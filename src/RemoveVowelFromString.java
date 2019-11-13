import java.util.ArrayList;

public class RemoveVowelFromString {
    public static void main(String[] args)
    {
        String s = "awerfvgtuio";
        ArrayList<Character>list=new ArrayList<>();
        list.add('a');list.add('e');list.add('i');list.add('o');list.add('u');
        StringBuilder sb= new StringBuilder();
        //int i=0; int j=s.length()-1;
        for(int i=0;i<s.length();i++)
        {
            if(!list.contains(s.charAt(i)))
                sb=sb.append(s.charAt(i));
        }
        System.out.println(sb.toString());

    }
}
