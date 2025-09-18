class ArmstrongNo {
    public static void main(String args[]) {
        int num = 153;
        int temp = num;
        int sum = 0;

        while (num > 0) {  // ✅ should be while, not if
            int digit = num % 10;
            sum += digit * digit * digit;
            num = num / 10;
        }

        if (temp == sum) {  // ✅ compare with temp, not num
            System.out.println(temp + " is an Armstrong number");
        } else {
            System.out.println(temp + " is not an Armstrong number");
        }
    }
}
