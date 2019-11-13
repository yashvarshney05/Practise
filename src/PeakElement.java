import java.util.ArrayList;
import java.util.List;

public class PeakElement {
    public static void main(String [] args)
    {
        //int a[]={10, 20, 15, 2, 23, 90, 6};
        int a[]={20,20,20};
        List<Integer>list=new ArrayList<>();
        if(allSame(a))
            System.out.println("all are peak element");
        else
        if(checkAscSort(a))
            System.out.println(a[a.length-1]);
        else
            if(checkDscSort(a))
                System.out.println(a[0]);


                else
                {
                    list=findPeakElement(a);
                    for(int i=0;i<list.size();i++)
                        System.out.println(list.get(i));
                }

    }

    private static boolean checkAscSort(int a[])
    {
        System.out.println("inside 1");
        for(int i=0;i<a.length-1;i++)
        {
        if(a[i+1]<a[i] && a[i+1]!=a[i])
            return false;
        }
        return true;
    }

    private static boolean checkDscSort(int a[])
    {
        System.out.println("inside 2");
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i+1]>a[i] && a[i+1]!=a[i])
                return false;
        }
        return true;
    }

    private static boolean allSame(int[] a)
    {
        System.out.println("inside 3");
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]!=a[i+1])
                return false;
        }
        return true;
    }

    private static List<Integer> findPeakElement(int[]a)
    {
        List<Integer>list=new ArrayList<>();
        for(int i=1;i<a.length-1;i++)
        {
            if(a[i]>a[i-1] && a[i]>a[i+1])
                list.add(a[i]);

        }
        return list;
    }
}
