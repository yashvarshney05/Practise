//https://www.geeksforgeeks.org/replace-every-array-element-by-sum-of-previous-and-next/
public class ArraReplaceProblem {

    public static void main(String args[])
    {
        int a[]={2, 3, 4, 5, 6};
        int pre=a[0];
        int curr=a[1];
         a[0]=pre+curr;
        for(int i=1;i<a.length-1;i++)
        {
            curr=a[i];
            a[i]=pre+a[i+1];
            pre=curr;
        }
        a[a.length-1]=pre+a[a.length-1];
        for(int i=0;i<a.length;i++) {
            System.out.println(a[i]);
        }
    }
}
