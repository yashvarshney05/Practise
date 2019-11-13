import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;
import org.omg.CORBA.portable.ValueOutputStream;

import java.awt.image.VolatileImage;

public class Search_Rotated_Array {

    public static void main(String[] args)
    {
        int a[]={5, 6, 7, 8, 9, 10, 1, 2, 3};
        int key =3;


        int l=0;
        int h=a.length-1;
        int pivot=getpivot(a,l,h);
        System.out.println("pivot=="+pivot);


    }

    private static int search(int[] a,int key)
    {

        int l=0;
        int h=a.length-1;
        int pivot=getpivot(a,l,h);
        System.out.println("pivot=="+pivot);
//        if(a[pivot]==key)
//            return pivot;
//        if(a[0]<pivot)
//            return binarySearch(a,pivot+1,h,key);
//            else
//                return binarySearch(a,l,pivot-1,key);
           return -1;

    }

    private static int getpivot(int []a,int low,int high)
    {

        // base cases
        if (high < low)
            return -1;
        if (high == low)
            return low;

        /* low + (high - low)/2; */
        int mid = (low + high)/2;       //low=0 //high=8 //mid=4
        if ( a[mid] > a[mid + 1])
            return mid;
        if (a[mid] < a[mid - 1])
            return (mid-1);
        if (a[low] >= a[mid])
            return getpivot(a, low, mid-1);
        return getpivot(a, mid + 1, high);
    }

    static int searchForPivot(int arr[], int low, int high)
    {



        return -1;

    }

    static int binarySearch(int arr[], int low, int high, int key)
    {
        if (high < low)
            return -1;

        /* low + (high - low)/2; */
        int mid = (low + high)/2;
        if (key == arr[mid])
            return mid;
        if (key > arr[mid])
            return binarySearch(arr, (mid + 1), high, key);
        return binarySearch(arr, low, (mid -1), key);
    }




}
