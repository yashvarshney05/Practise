public class Sorting012 {

    public static void main(String[] args)
    {
        int a[]={0,2,1,2};
        int low=0,high=a.length-1,mid=0,temp=0;
        while (mid<=high)
        {
            switch (a[mid])
            {
                case 0: {
                    temp = a[low];
                    a[low] = a[mid];
                    a[mid] = temp;
                    low++;
                    mid++;
                    break;
                }
                case 1:
                    mid++;
                case 2:
                {
                    temp = a[mid];
                    a[mid] = a[high];
                    a[high] = temp;
                    high--;
                }
            }
        }
    }
}
