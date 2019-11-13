public class MinInRotatedArray {

    public static void main(String[] args) {
        int a[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
        System.out.println(getMin(a,0,a.length-1));

        // int a[] = {5, 6, 7, 8, 9, 10, 1, 2, 3};
    }

    private static int getMin(int[]a ,int low,int high)
    {
        int mid=(low+high)/2;
        if(a[mid-1]>a[mid])
            return a[mid];
        if(a[mid]>a[mid+1])
            return a[mid+1];
        if(mid<high && a[mid]>a[high])
            return getMin(a,mid+1,high);
        return getMin(a,low,mid-1);

    }
}
