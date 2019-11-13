//https://leetcode.com/problems/rotate-array/

public class RotateArrayInKSteps {

    public static void main(String[] args)
    {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        rotate(arr,3);

    }

    private static void rotate(int a[],int k)
    {

        reverse(a,0,k);
        reverse(a,k+1,a.length-1);
        reverse(a,0,a.length-1);
    }

    private static void reverse(int a[],int start,int end)
    {
        while(start<end)
        {
            int temp=a[start];
            a[start]=a[end];
            a[end]=temp;
            start++;
            end--;
        }
    }
    }
