public class SumOfDigits {
    public static void main(String[] args) {
        int n = 1342;
        int result = findSum(n);
        System.out.println(result);
    }

    static int findSum (int n) {
        if (n == 0) {
            return 0;
        } else {
            return n % 10 + findSum(n / 10);
        }
    }
}
