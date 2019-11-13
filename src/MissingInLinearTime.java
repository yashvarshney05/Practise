import java.util.Arrays;

//https://leetcode.com/problems/missing-number/
public class MissingInLinearTime {
    public static void main(String[] args)
    {
        int a[]={1,3,4,2,1};
        System.out.println(findDuplicate(a));
    }

    private static int missingNumber(int[] nums) {
       int sum=0,sum1=0;
       for(int i=0;i<nums.length;i++)
       {
           sum=sum+nums[i];
           //System.out.println("sum=="+sum);
       }
       for(int i=1;i<=nums.length;i++)
       {
           sum1=sum1+i;
           //System.out.println("sum1=="+sum1);
       }
       return Math.abs(sum-sum1);
    }

    private static int findDuplicate(int nums[])
    {
        int length = nums.length;

        while (nums[0] != nums[nums[0]]) {
            //swap nums[0] with nums[nums[0]]
            System.out.println("nums[0]=="+nums[0]);
            System.out.println("nums[nums[0]]=="+nums[nums[0]]);
            int temp = nums[0];
            nums[0] = nums[nums[0]];
            nums[temp] = temp;
        }
        return nums[0];

    }


}
