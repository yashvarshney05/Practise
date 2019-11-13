import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class CountArrayElement {

    public static void main(String[] args) {
        int arr[] = {6, 10, 12, 15, 2, 4, 5};
        int x=14;
        System.out.println(count(arr,0, arr.length-1,x));
    }

        private static int count(int a[], int low,int high,int key)
    {
        int mid=(low+high)/2; //3
        System.out.println("a[mid]==="+a[mid]);
        if(a[mid]==key)
            return mid+1;

        if(a[mid]>key && a[mid-1]<key)
            return mid;
        if (a[low]>=a[mid])
            return count(a,0,mid-1,key);
       return count(a,mid,a.length-1,key);
    }
}
