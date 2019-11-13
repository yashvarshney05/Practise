public class ElementOnceInSortedArray {

    public static void main(String [] args)
    {
        int a[]={1, 1, 2, 2, 3, 3, 4, 50, 50, 65, 65};
        int xor=a[0];
        for(int i=1;i<a.length;i++)
        {
            xor=xor^a[i];
        }
        System.out.println(xor);
    }
}
