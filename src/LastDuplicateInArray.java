public class LastDuplicateInArray {

    public static void main(String[] args)
    {
        int a[] = {1, 5, 5, 6, 7, 8};
        for(int i=a.length-1;i>0;i--)
        {
            if(a[i]==a[i-1])
            {
                System.out.println("Last index:" + i);
                System.out.println("Last duplicate item: "
                        + a[i]);
                break;
            }
        }
        firstDuplicate(a);
    }

    private static int firstDuplicate(int a[])
    {
        for(int i=0;i<a.length-1;i++)
        {

            if(a[i]==a[i+1]) {
                System.out.println("First index:" + i);
                System.out.println("First duplicate item: "
                        + a[i]);
                break;
            }
        }
        return -1;
    }
}
