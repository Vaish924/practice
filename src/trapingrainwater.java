class TrappingRainWater {
    public static int trapWater(int[] arr) {
        int n = arr.length;
        if (n <= 2) return 0; // Not enough blocks to trap water

        int[] leftMax = new int[n];
        int[] rightMax = new int[n];

        // Step 1: Fill leftMax
        leftMax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], arr[i]);
        }

        // Step 2: Fill rightMax
        rightMax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], arr[i]);
        }

        // Step 3: Calculate trapped water
        int totalWater = 0;
        for (int i = 0; i < n; i++) {
            totalWater += Math.min(leftMax[i], rightMax[i]) - arr[i];
        }

        return totalWater;
    }

    public static void main(String[] args) {
        int[] arr1 = {3, 0, 1, 0, 4, 0, 2};
        System.out.println(trapWater(arr1)); // Output: 10

        int[] arr2 = {3, 0, 2, 0, 4};
        System.out.println(trapWater(arr2)); // Output: 7

        int[] arr3 = {1, 2, 3, 4};
        System.out.println(trapWater(arr3)); // Output: 0

        int[] arr4 = {2, 1, 5, 3, 1, 0, 4};
        System.out.println(trapWater(arr4)); // Output: 9
    }
}
