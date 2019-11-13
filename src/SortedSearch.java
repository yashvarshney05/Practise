public class SortedSearch {
    public static void main(String [] args)
    {
        int a[]={5,1,2,3};int x=4;
        System.out.println(countNumbers(a,x));
    }
    private static int countNumbers(int a[],int x)
    {
        int low=0;
        int high=a.length;
        int mid=low+(high-low)/2;
        while(low<high)
        {
            if( a[mid]<=x)
                return mid-low+1;
            else
                if(a[mid]>x)
                {
                    high=mid-1;
                }
                else
                    low=mid+1;
        }
        return -1;
    }
}
