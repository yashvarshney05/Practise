import java.util.Arrays;

public class MaxMeetingInRoom {
    public static void main(String [] args)
    {
        int start[]={1,3, 0, 5, 8,5};
        int end[]={2, 4, 6, 7, 9, 9};
        Arrays.sort(start);
        Arrays.sort(end);
       int i=0;int j=0;
       int room=0;
       while (i<start.length && j<end.length)
       {
           if(start[i]<end[j]) {
               room++;i++;
           }
           else
           {
               room--;
               j++;
           }
       }
       System.out.println("room="+room);
    }
}

