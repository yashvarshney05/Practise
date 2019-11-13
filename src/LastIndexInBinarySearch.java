import java.util.Arrays;

public class LastIndexInBinarySearch {
    public static void main(String []args)
    {
        int a[]={5,7,7,8,8,8,8,8};int target=8;
        System.out.println(getFrequencyMoreThanHalf(a));
       // System.out.println(getFirstIndex(a,0,a.length-1,target));
    }

    private static int getFirstIndex(int a[],int low,int high,int target)
    {
        if(high>=low)
        {
            int mid=low+(high-low)/2;
            if(mid == 0 || (a[mid-1]<target && a[mid]==target ))
                return mid+1;
            if(target<=a[mid])
                return getFirstIndex(a,low,mid-1,target);
            else
                return getFirstIndex(a,mid+1,high,target);
        }
        return -1;
    }


    private static int getLastIndexBinarySearch(int a[],int low,int high,int target)
    {
         if(high>=low) {
             int mid = low + (high - low) / 2; //3
             if (( mid == a.length - 1||a[mid] == target && target<a[mid+1]))
                 return mid + 1;


              if (target < a[mid])
                 return getLastIndexBinarySearch(a, low, mid - 1, target);
              else
              if (target >= a[mid])
                  return getLastIndexBinarySearch(a, mid + 1, high, target);
         }
              return -1;
    }

    private static int getFrequencyMoreThanHalf(int a[])
    {
        int n=a.length;

        for(int i=0;i<a.length;i++)
        {
            System.out.println("inside loop");

                int first = getFirstIndex(a, 0, a.length - 1, a[i]);
               // System.out.println("first=="+first);
                int last = getLastIndexBinarySearch(a, 0, a.length - 1, a[i]);
               // System.out.println("last=="+last);
                if (last - first + 1 > n / 2)
                    return a[i];
        }
       return -1;

    }


}
