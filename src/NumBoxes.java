import java.util.Arrays;

public class NumBoxes {

    static int numBoxes(int A[], int n, int K)
    {
        // Sort the boxes in ascending order
        Arrays.sort(A);

        // Try to fit smallest box with
        // current heaviest box (from right
        // side)
        int i = 0, j = n - 1;
        int ans = 0;
        while (i <= j) {
            ans++;
            if (A[i] + A[j] <= K) {
                i++;
                System.out.println("inside if=="+i);
            }
            j--;
            System.out.println("inside if=="+j);
        }

        return ans;
    }

    // Driver program
    public static void main(String args[])
    {
        int A[] = { 3, 2, 2, 1 }, K = 3;
        int n = A.length;
        System.out.println(numBoxes(A, n, K));

    }
}
