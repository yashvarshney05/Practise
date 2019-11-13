import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumber {


    static List<Integer> list =new ArrayList<>();
   static int []a;
    public static void main(String[] args)
    {
        Random random=new Random();
        a=new int[10];

        for(int i=0;i<5;i++) {

        a[i]=i;
        }

        for(int i=0;i<5;i++) {
            int r=random.nextInt(10);

            System.out.println(avoidDuplication(r));
        }


    }

    private static int avoidDuplication(int r)
    {
        //if (a[r] ==-1)

       return a[r];
    }
}
