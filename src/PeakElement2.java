//https://practice.geeksforgeeks.org/problems/find-the-highest-number/0
public class PeakElement2 {
    public static void main(String [] args)
    {
        int a[]={1,2, 3, 4, 5,6,5,4};
        int l=0;
        int h=a.length-1;
        while (l<=h)
        {
            int m=(l+h)/2;
            if(m==h) {
                System.out.println(a[m]);
                break;
            }
            if(a[m-1]<a[m] && a[m]>a[m+1]) {
                System.out.println(a[m]);
                break;
            }
            if(a[m]<a[m+1])
                l=m+1;
            else
                h=m-1;
        }
    }
}

