public class PelindromicArray {
    public static void  main(String []args)
    {
        int a[]={2,0,1};
        int i=0;
        int j=a.length-1;
        int s1=0,s2=0; boolean flag=false;
        s1=s1+a[i];
        s2=s2+a[j];
        while (i<a.length && i<j)
        {
              flag=false;
            System.out.println("s1=="+s1);

            System.out.println("s2=="+s2);
            if(s1==s2)
                flag=true;
            if(s1<s2) {
                i++;
                s1=s1+a[i];

            }
            else {
                j--;
                s2=s2+a[j];

            }

        }
        if(flag==true)
            System.out.println("true");
        else
            System.out.println("false");

    }
}
