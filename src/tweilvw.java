import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Twelve {
    public static List<Integer> find(int arr[]) {
        int first = Integer.MAX_VALUE;
        int sec = Integer.MAX_VALUE;

        for (int num : arr) {
            if (num <= first) {
                first = num;
            } else if (num <= sec) {
                sec = num;
            } else {
                // Found third number > sec
                return Arrays.asList(first, sec, num);
            }
        }

        return new ArrayList<>();
    }

    public static void main(String args[]) {
        int arr[] = {1, 4, 6, 8, 3};
        List<Integer> s = find(arr);
        System.out.println(s);
    }
}
