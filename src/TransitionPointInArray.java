//https://practice.geeksforgeeks.org/problems/find-transition-point/1
public class TransitionPointInArray {
    public static void main(String [] args) {
        int a[]={0,0,0,0,1,1};
        int low=0;
        int high= a.length;
        System.out.println(lastIndex(a,0,high));

    }

    private static int lastIndex(int a[],int low,int high)
    {
        int mid=(low+high)/2;
        System.out.println("mid=="+mid);
        if(mid==high)
            return mid;
        if(a[mid]==0 && a[mid+1]==1)
            return mid;
        if(a[mid+1]==0)
            lastIndex(a,mid+1,high);
        return -1;
    }
}
