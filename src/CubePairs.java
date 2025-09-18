class CubePairs {
    public static void main(String[] args) {
        int n = 9;   // Example input
        int count = 0;

        // a starts from 1, b starts from 0
        for (int a = 1; a * a * a <= n; a++) {
            for (int b = 0; b * b * b <= n; b++) {
                if (a * a * a + b * b * b == n) {
                    count++;
                    System.out.println("Pair: (a=" + a + ", b=" + b + ")");
                }
            }
        }

        System.out.println("Total pairs = " + count);
    }
}
