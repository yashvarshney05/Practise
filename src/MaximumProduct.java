import java.util.ArrayList;
import java.util.List;

public class MaximumProduct {
    public static void main(String [] args)
    {
        int a[]={1, 4, 3, 6, 7, 0}; //{-1, -3, -4, 2, 0, -5}
    }

    private static boolean countPos(int[] a)
    {
        int c=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>0)
                c++;
            if(c>=2)
                return true;
        }
        return false;
    }

    private static List<Integer> findTwoMax(int a[])
    {
        List<Integer> list=new ArrayList<>();
        int f_max=0,s_max=0;
        if(a[0]>a[1])
        {
            f_max=a[0];
            s_max=a[1];
        }
        else
        {
            f_max=a[1];
            s_max=a[0];
        }
        if(a.length>2) {
            for (int i=2;i<a.length;i++)
            {
                if(a[i]>f_max)
                {
                    System.out.println("inside this");
                    s_max=f_max;
                    f_max=a[i];

                }
                else
                if(a[i]>f_max && a[i]<s_max)
                {
                    System.out.println("inside that");
                    f_max=a[i];
                }
            }

        }
        list.add(f_max);list.add(s_max);
        return list;
    }

    }

