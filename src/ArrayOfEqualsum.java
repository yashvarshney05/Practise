public class ArrayOfEqualsum {
    public static void main(String [] args)
    {
        int a[]={1 , 2 , 3 , 4 , 5 , 5 };
        int sum=0;
        int i=0;int j=a.length-1;
        int rSum=0,lSum=0;
        rSum=rSum+a[i];
        lSum=lSum+a[j];
        while(i<a.length && j>0)
        {

            if (rSum==lSum) {
                System.out.println( i);
                break;
            }
            if(rSum<lSum) {
                i++;
                rSum=rSum+a[i];
                System.out.println("rsum=="+rSum);
            }
            else {
                j--;
                lSum=lSum+a[j];
                System.out.println("lSum=="+lSum);
            }
        }
    }
}
