public class CheckSortedArray {

    public static void main(String [] args)
    {
        int a[]={7, 9, 11};
        System.out.println(checkSorted(a,0,a.length-1));
    }

    private static boolean checkSorted(int[]a,int low,int high)
    {
        int mid=(low+high)/2;
        if(a[low]<a[high])
            return false;
        if(a[low]==a[high])
            return false;
        if(a[mid-1]<a[mid] && a[mid]<a[mid+1])
            return true;
       return false;
    }
}
