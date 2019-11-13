public class SeggregateEvenOdd {

    public static void main(String[] args)
    {
        int a[]={0,0,2,1,1};
        int low=0,high=a.length-1;
        int mid=0;
        while(mid<=high)
        {
            switch (a[mid])
            {
                case 0:
                    int temp=a[low];
                    a[low]=a[mid];
                    a[mid]=temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                   temp=a[mid];
                   a[mid]=a[high];
                   a[high]=temp;
                   high--;


            }
        }
        for (int i=0;i<a.length;i++)
            System.out.println(a[i]);
    }
}
