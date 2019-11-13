public class RemoveDupFROmSorted {

    public static void main(String[] args)
    {
        int a[]={1,1,2,3,4};
        int k=0;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]!=a[i+1]) {
                a[k] = a[i + 1];
                k++;
            }
        }
        for(int i=0;i<k;i++)
            System.out.println(a[k]);

    }
}
