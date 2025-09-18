class ClosestDivisible {
    static int closestNumber(int n, int m) {
        int q = n / m;

        int cand1 = m * q;

        int cand2 = (n * m > 0) ? m * (q + 1) : m * (q - 1);

        if (Math.abs(n - cand1) < Math.abs(n - cand2)) {
            return cand1;
        } else if (Math.abs(n - cand1) > Math.abs(n - cand2)) {
            return cand2;
        } else {
            // Equal distance → pick the one with larger absolute value
            return Math.abs(cand1) > Math.abs(cand2) ? cand1 : cand2;
        }
    }

    public static void main(String[] args) {
        int n = 13, m = 4;
        System.out.println(closestNumber(n, m)); // Output: 12
    }
}
