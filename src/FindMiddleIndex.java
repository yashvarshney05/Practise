public class FindMiddleIndex {
    public static void main(String a[]) {
        int[] num = {2, 4, 4, 5, 4, 1};

        int l=0,r=num.length-1;
        int lsum=0,rsum=0;
        while(l<r)
        {
            lsum=lsum+num[l];
            rsum=rsum+num[r];
            if(lsum == rsum)
                System.out.println(r-l+1);
            if(lsum<rsum)
                l++;
            else
                r--;
        }

        String s="test";
        System.out.println(s.substring(0,1));
    }
}
