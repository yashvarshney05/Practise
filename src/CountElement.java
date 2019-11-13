/*
Given two unsorted arrays arr1[] and arr2[]. They may contain duplicates.
For each element in arr1[] count elements less than or equal to it in array arr2[].
https://www.geeksforgeeks.org/element-1st-array-count-elements-less-equal-2nd-array/
 */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

public class CountElement {

    public static void main(String args[])
    {
       int  arr1[] = {1, 2, 3, 4, 7, 9};
        int arr2[] = {0, 1, 2, 1, 1, 4}; // 0 1 1 1 2 4


        //System.out.println(findLastIndex(arr2,0,arr2.length,key)+1);
         count(arr1,arr2);

    }

    private static void count(int []a,int[]b)
    {

        Arrays.sort(b);
         int c[]=new int[a.length];
         int k=0;
        for(int i=0;i<a.length;i++)
        {
            System.out.println("a[i]=="+a[i]);
            c[k]=findLastIndex(b,0,b.length-1,a[i]);
            System.out.println("c[k]++=="+c[k]++);
             k++;
             if(k>a.length) break;
        }

        }

    private static int findLastIndex(int a[],int low,int high,int key)
    {
        if(low <high) {
            //System.out.println("low==" + low);
            //System.out.println("high==" + high);
            int mid = (low + high) / 2;
            //System.out.println("a[mid]==" + a[mid]);
            //System.out.println("key==" + key);
            if (a[mid] == key && a[mid + 1] > key) {//mid=3 key=2 a[mid] ==1
               // System.out.println("control is here 1");
                return mid;
            }
            if (a[mid] > key) {
               // System.out.println("control is here 2");
                return findLastIndex(a, 0, mid - 1, key); //4,6,1
            }
           // System.out.println("control is here 3");
            return findLastIndex(a, mid + 1, high, key);
        }
        return -1;
    }

}
