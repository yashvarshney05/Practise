import java.util.Arrays;

//https://www.geeksforgeeks.org/minimum-number-platforms-required-railwaybus-station/
public class Platform {

    public static void main(String [] args)
    {
        double arr[] = {9.00, 9.40, 9.50, 11.00, 15.00, 18.00};
        double dep[]  = {9.10, 12.00, 11.20, 11.30, 19.00, 20.00};
        Arrays.sort(arr);Arrays.sort(dep);
        System.out.println(getMinPlatform(arr,dep));
    }

    private static int getMinPlatform(double[]  arr,double[] dep)
    {
        int max=1;
        int i=1,j=0;
        int n=arr.length;
        int count=1;
        while(i<n && j< n)
        {
            if(arr[i]<dep[j])
            {
                i++;
                count++;

            }
            else
            {
                j++;
                count--;
            }
            if(count>max)
                max=count;
        }
        return max;
    }
}
