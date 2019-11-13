import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class CommonInArray {
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4};
        int b[] = {4, 5};
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < b.length; i++) {
            int index = Arrays.binarySearch(a, b[i]);
            if (index > 0) {
                list.add(b[i]);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
