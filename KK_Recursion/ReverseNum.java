public class ReverseNum {
    public static void main(String[] args) {
        int num = 123;
//        rev1 (num);
//        System.out.println(sum);

       int result = rev2(num);
        System.out.println(result);
    }

    static int sum = 0;
    static void rev1 (int num) {
        if (num == 0) {
            return;
        } else {
            int rem = num % 10;
            sum = sum * 10 + rem;
            rev1(num / 10);
        }
    }

    static int rev2(int n) {
        int digits = (int) (Math.log10 (n) ) + 1;
        return helper (n, digits);
    }

    static int helper (int n, int digits) {
        if (n % 10 == n) {
            return n;
        } else {
            int rem = n % 10;
            return rem * (int) (Math.pow (10, digits - 1)) + helper (n / 10, digits - 1);
        }
    }
}
