//https://www.geeksforgeeks.org/replace-every-array-element-by-multiplication-of-previous-and-next/
public class ReplaceElement {
    public static void main(String[] args)
    {
      int a[] = {2, 3, 4, 5, 6};
      int pre=a[0];
      a[0]=a[0]*a[1];
      for(int i=1;i<a.length-1;i++)
      {
         int curr=a[i];
         a[i]=pre* a[i+1];

         pre=curr;

      }
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

    }
}
