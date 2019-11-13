public class MaxInRotated {

    private static int getMax(int[] a, int low,int high)
    {
        int mid=(low+high)/2;
        if(a[mid]>a[mid+1])
            return mid;
        if(a[mid]<a[mid-1])
            return mid-1;
        if(a[low]>=a[mid])
            return getMax(a,low,mid-1);
        return getMax(a,mid+1,high);

    }

    public static void main(String[] args)
    {
        int []a={3, 4, 5, 1, 2};
        System.out.println(getMax(a,0,a.length-1));
    }


}
