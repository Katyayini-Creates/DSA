public class palindromeCheck {
    public static void main(String[] args) {
        int num = 122;
        if (num == rev (num)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }

    static int rev (int num) {
        int digits = (int) (Math.log10 (num)) + 1;
        return helper (num, digits);
    }

    static int helper (int num, int digits) {
        if (num % 10 == num) {
            return num;
        } else {
            int rem = num % 10;
            return rem * (int) (Math.pow(10, digits - 1)) + helper (num / 10, digits - 1);
        }
    }
}
