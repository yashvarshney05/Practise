public class MaxInRotatedArray {

    public static void main(String[] args) {
        int a[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        System.out.println(getMax(a,0,a.length-1));

       // int a[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
    }

    private static int getMax(int[]a ,int low,int high)
    {
        int mid=(low+high)/2; //4 a[4]=9
        if(a[mid+1]<a[mid])
            return a[mid];
        if(a[mid]<a[mid+1])
            return a[mid+1];
        if(a[low]<=a[high])
            return -1;
        if(a[low]>=a[mid])
           return getMax(a,low,mid-1);
        return getMax(a,mid+1,high);
    }
}
