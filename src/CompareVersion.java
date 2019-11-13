public class CompareVersion {

    public static int compareVersion(String version1, String version2) {

        if(version1.equalsIgnoreCase(version2))
            return 0;
        int index1=version1.indexOf('.');
        int index2=version2.indexOf('.');
        if(index1 > 0 && index2 > 0)
        {

            int rem1=Integer.valueOf(index1)%10;
            int rem2=Integer.valueOf(index2)%10;

            System.out.println("rem1=="+rem1+"rem2=="+rem2);
            if(rem1>rem2)
                return 1;
            else
            if(rem1<rem2)
                return -1;
            else
                return 0;
        }

        if(index1 < 0 && index2 >0)
            return 1;
        else
        if(index1 > 0 && index2 <0)
            return -1;


        String[] a=version1.split("\\.");
        String[] b=version2.split("\\.");
        int len=0;
        if(a.length<b.length)
            len=a.length;
        else
            len=b.length;
        boolean flag=false;
        for(int i=0;i<len;i++)
        {
            if(Integer.valueOf(a[i])>Integer.valueOf(b[i]))
                flag=true;
            else
                flag=false;
        }
        if(flag)
            return 1;
        return -1;
    }

    private static int getSum(String[] t)
    {
       int sum=0;
       for(int i=0;i<t.length;i++)
       {
           sum=sum*10+Integer.parseInt(t[i]);
       }
       return sum;
    }

    public static void  main(String [] args)
    {
        System.out.println(compareVersion("0","1"));
    }
}
