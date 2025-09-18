class PrimePairs {

    // Check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void findPrimePairs(int n) {
        for (int p = 2; p <= n; p++) {
            if (isPrime(p)) {
                for (int q = p; q <= n; q++) {  // start q from p to avoid duplicates like (2,3) and (3,2)
                    if (isPrime(q) && p * q <= n) {
                        System.out.println(p + " " + q);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int n = 10;  // Example input
        findPrimePairs(n);
    }
}
