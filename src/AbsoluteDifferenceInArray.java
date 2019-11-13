//https://www.geeksforgeeks.org/replace-all-elements-by-difference-of-sums-of-positive-and-negative-numbers-after-that-element/
public class AbsoluteDifferenceInArray {
    public static void main(String[] args) {

        int a[] = {1, -1, 2, 3, -2};
        int sum=0;
        replacedArray(a.length,a);


    }

    static void replacedArray(int N, int arr[])
    {
        int pos_sum, neg_sum, i, j, diff;

        pos_sum = 0;
        neg_sum = 0;

        for (i = N - 1; i >= 0; i--)
        {

            // calculate differenbce of both sums
            diff = Math.abs(pos_sum) - Math.abs(neg_sum);
            System.out.println("diff=="+diff);

            // if i-th element is positive,
            // add it to positive sum
            if (arr[i] > 0)
            {  pos_sum += arr[i];
            System.out.println("pos_sum=="+pos_sum);}

                // if i-th element is negative,
                // add it to negative sum
            else
                neg_sum += arr[i];
            System.out.println("neg_sum=="+neg_sum);

            // replace i-th elements with
            // absolute difference
            arr[i] = Math.abs(diff);
        }
        for( i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
}
