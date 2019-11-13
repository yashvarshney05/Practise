//https://practice.geeksforgeeks.org/problems/facing-the-sun/0
public class FacingTheSun {
    public static void main(String args[])
    {
        int a[]={7, 7, 8, 2, 9};
        int pre=a[0];int c=1;
        for(int i=1;i<a.length;i++)
        {
            if(a[i]>pre)
            {
                c++;
                pre=a[i];
            }
        }
        System.out.println("count=="+c);
    }
}
