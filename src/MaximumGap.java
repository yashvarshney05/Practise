import java.util.Arrays;

/*Given an unsorted array, find the maximum difference between the successive elements in its sorted form.
        Return 0 if the array contains less than 2 elements.
        Input: [3,6,9,1]
        Output: 3
        Explanation: The sorted form of the array is [1,3,6,9], either
        (3,6) or (6,9) has the maximum difference 3. */
public class MaximumGap {

    public static void main(String[] args)
    {
        int nums[]={3,6,9,1};
        int max=0;

        Arrays.sort(nums);
        for(int i=nums.length-1;i>0;)
        {
            int diff=nums[i]-nums[i-1];
            if (diff>max) {
                max=diff;

            }
            i--;
        }
        System.out.println(max);
    }
}
