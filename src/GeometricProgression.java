public class GeometricProgression {
    public static long findNthTerm(int a, int r, int n) {
        // Use Math.pow for exponentiation
        return (long)(a * Math.pow(r, n - 1));
    }

    public static void main(String[] args) {
        int a = 2, r = 3, n = 4;
        long nthTerm = findNthTerm(a, r, n);
        System.out.println("Nth term of GP = " + nthTerm);
    }
}
