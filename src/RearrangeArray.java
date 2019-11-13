//https://www.geeksforgeeks.org/rearrange-array-order-smallest-largest-2nd-smallest-2nd-largest/

import java.util.Arrays;

public class RearrangeArray {
    public static void main(String[] args)
    {
        int a[]={5, 8, 1, 4, 2, 9, 3, 7, 6};
        Arrays.sort(a);
        int i=0;
        int j=a.length-1;
        int l=0,r=1;
        int temp[]=new int[a.length];
        while(i<=j)
        {
            if(l<=a.length-1) {
                temp[l] = a[i];
                System.out.println("temp[l]==" + temp[l]);
                i++;
                l = l + 2;
            }

            if(r<=a.length-1) {
                temp[r] = a[j];
                System.out.println("temp[r]==" + temp[r]);
                j--;
                r = r + 2;
            }
        }
        for(i=0;i<a.length;i++)
            System.out.println(temp[i]);
    }
}

