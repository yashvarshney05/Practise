public class RotateArray {
    public static void main(String[] args)
    {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        rotate(arr,3);
    }
    private static void rotate(int a[],int k)
    {
            int n=a.length ;

            for(int i=0;i<n;i=i+k)
            {
                int left=i;
                int right=Math.min(i+k-1,n-1);
                while(left<right)
                {
                    int temp=a[left];
                    a[left]=a[right];
                    a[right]=temp;
                    left++;
                    right--;
                }
            }
       System.out.println("array after rotation");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
    }
}
