public class HouseProblemAgain {

    public static void main(String [] args)
    {
        int a[]={10,10,10,10,10};
        int res[]=new int[a.length];
        res[0]=a[0];
        res[1]=Math.max(a[0],a[1]);
        for(int i=2;i<a.length;i++)
        {
            res[i]=Math.max(a[i]+res[i-2],res[i-1]);
        }
      System.out.println(res[a.length-1]);
    }
}
