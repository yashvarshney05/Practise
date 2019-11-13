//https://www.geeksforgeeks.org/replace-duplicates-with-greater-than-previous-duplicate-value/

public class ArrayRepeat {

    public static void main(String [] args)
    {
        int a[]={5, 2, 1, 1, 2, 2};
       /* for(int i=0;i<a.length-1;i++)
        {
            if(a[i]==a[i+1])
            {
                //int temp=a[i];
                a[i+1]=a[i]+1;
            }

        }
        if(a[a.length-1]<a[a.length-2])
            a[a.length-1]=a[a.length-2]+1; */
        for(int i=0;i<a.length;i++)
        {
          //  System.out.println(a[i]);
        }

        replace_elements(a,a.length);
    }

    static void replace_elements(int arr[], int n)
    {
        int pos = 0; // Index in result

        for(int i=0;i< arr.length-2;i++)
        {

            if(arr[i]!=arr[i+1]) {
                arr[pos]=arr[i];
                pos++;
                System.out.println("pos=="+pos);
            }
            else
            {
                arr[pos]=arr[i+2]+1;

                System.out.println("i=="+i+"arr[i]=="+arr[pos]);
               // pos--;
            }
        }

        // to print new array
        for (int i = 0; i < pos; i++)
            System.out.print( arr[i] + " ");
    }
}
