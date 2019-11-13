//https://www.geeksforgeeks.org/replace-two-consecutive-equal-values-one-greater/
public class ReplaceTwoConsecutive {
    public static void main(String [] args)
    {
        int a[]={5,2,1,1};

        int pos=0;
        for(int i=0;i<a.length;i++)
        {
           a[pos++]=a[i];
           while(pos>1 && a[pos-1]==a[pos-2])
           {
               pos--;
               a[pos-1]++;
           }
        }

        for(int i=0;i<pos;i++)
        {
            System.out.println(a[i]);
        }
    }
}
