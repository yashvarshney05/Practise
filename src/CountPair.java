import java.util.Arrays;

public class CountPair {

    public static void main(String args[]) {
        int a[] = {1, 2, 3, 4};
        int k=2;
        int l=0;
        int r= a.length-1;
        for(int i=0;i<a.length;i++)
        {
            int temp=Math.abs(k-a[i]);
            if(temp>=k) {
                int index = Arrays.binarySearch(a, temp);
                System.out.println("a[i]==" + a[i]);
                for (int j = index; j < a.length; j++)
                    System.out.println("pairs are==" + a[j]);
            }
        }
    }
}
