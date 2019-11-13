public class SquareRootOfNumber {

    public static void main(String [] args) {
        int x=8;
        int low=0, high=x;
        System.out.println(convertTo5AGain(102));
      //  System.out.println(getSquareRoot(x,0,x));
    }

    private static int getSquareRoot(int x,int low,int high)
    {
        if(x==0)
            return 0;
        if(x==1) return 1;
        int mid=(low+high)/2;
        if(mid*mid==x)
            return mid;

            return getSquareRoot(x,0,mid-1);

    }

    private static int convert0To5Rec(int num)
    {
        // Base case for recursion termination
        if (num == 0)
            return 0;

        // Extraxt the last digit and
        // change it if needed
        int digit = num % 10;
        if (digit == 0)
            digit = 5;

        // Convert remaining digits and
        // append the last digit
        return convert0To5Rec(num/10) *
                10 + digit;
    }

    private static int convertTo5AGain(int num)
    {
        String s=String.valueOf(num);
        String s1=s.replaceAll("0","5");
        return Integer.valueOf(s1);
    }
}
