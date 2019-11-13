import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayIntersect {
    public static void main(String[] args)
    {
        int nums11[] = {1,2,2,1}, nums12[] = {2,2};
        int a[]=(intersection(nums11,nums12));
        for(int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set=new HashSet<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i=0,j=0;
        int a[]=new int[Math.min(nums1.length,nums2.length)];
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]<nums2[j])
                i++;
            else
            if(nums1[i]>nums2[j])
                j++;
            else
             {
                System.out.println("inside");
                set.add(nums1[i]);
                i++;
                j++;
            }
        }

        i=0;
        for(Integer x:set)
        {
            a[i]=x;
            i++;
        }

        return a;
    }

}
