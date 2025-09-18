import java.util.Arrays;

class ChocolateDistribution {
    public static int findMinDiff(int arr[], int m) {
        if (m == 0 || arr.length == 0) return 0;
        if (arr.length < m) return -1; // Not enough packets

        // Step 1: Sort the array
        Arrays.sort(arr);

        int minDiff = Integer.MAX_VALUE;

        // Step 2: Check every subarray of size m
        for (int i = 0; i + m - 1 < arr.length; i++) {
            int diff = arr[i + m - 1] - arr[i];
            minDiff = Math.min(minDiff, diff);
        }

        return minDiff;
    }

    public static void main(String[] args) {
        int arr1[] = {3, 4, 1, 9, 56, 7, 9, 12};
        int m1 = 5;
        System.out.println(findMinDiff(arr1, m1)); // Output: 6

        int arr2[] = {7, 3, 2, 4, 9, 12, 56};
        int m2 = 3;
        System.out.println(findMinDiff(arr2, m2)); // Output: 2
    }
}
