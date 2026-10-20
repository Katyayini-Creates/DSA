public class ProductOfDigits {
    public static void main(String[] args) {
        int n = 1342;
        int result = findProduct(n);
        System.out.println(result);
    }

    static int findProduct (int n) {
        if (n == 0) {
            return 1;
        } else {
            return n % 10 * findProduct(n / 10);
        }
    }
}
