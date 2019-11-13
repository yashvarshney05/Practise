public class TwoMax {
    public static void main(String[] args)
    {
        int a[]={1,2,3,4};
        int f_max=0,s_max=0;
        if(a[0]>a[1])
        {
            f_max=a[0];
            s_max=a[1];
        }
        else
        {
            f_max=a[1];
            s_max=a[0];
        }
        if(a.length>2) {
            for (int i=2;i<a.length;i++)
            {
                if(a[i]>f_max)
                {
                    System.out.println("inside this");
                    s_max=f_max;
                    f_max=a[i];

                }
                else
                    if(a[i]>f_max && a[i]<s_max)
                    {
                        System.out.println("inside that");
                        f_max=a[i];
                    }
            }

        }
        System.out.println(f_max+"==="+s_max);
    }
}
