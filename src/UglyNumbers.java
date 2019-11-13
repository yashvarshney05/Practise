//https://leetcode.com/problems/ugly-number/

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

import java.util.ArrayList;
import java.util.List;

public class UglyNumbers {
    public static void main(String[] args)
    {
           System.out.println(nthUglyNumber(1352));
    }
    private static boolean isUgly(int num)
    {
        if(num<=0)
            return false;
        while(num%2==0|| num%3==0||num%5==0)
        {
            if(num%2==0)
                num=num/2;
            if(num%3==0)
                num=num/3;
            if(num%5==0)
                num=num/5;
        }
        if(num>5)
            return false;
        return true;
    }

    private static int nthUglyNumber(int num)
    {

        if(num<=0)
            return 0;
        if(num==1)
            return 1;
        int count=1,i =2;
        if(num>1) {


                for(;count<=num;i++)
                {
                    if(isUgly(i))
                    {
                        count++;
                    }
                    if (count == num) {

                        return i;
                    }
                }



        }
      return -1;
    }
}
