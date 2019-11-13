import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MissingPositive {

    public static int firstMissingPositive(int[] nums) {
        Set<Integer> s =new HashSet<Integer>();
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>0)
                s.add(nums[i]);
        }
         int max=getMax(nums);
        for(int i=1;i<max;i++)
        {
            if(!s.contains(i))
                return i;
        }
       return max+1;
    }

    private static int getMax(int[] nums)
    {
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>max)
                max=nums[i];
        }
        return max;
    }

    public static void main(String[] args)
    {
        int nums[]={1,2,0};
        int res=firstMissingPositive(nums);
        System.out.println(res);
    }
}
