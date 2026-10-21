public class CountZeroes {
    public static void main(String[] args) {
        int num = 1000000;
        int count = 0;
        int result = find (num, count);
        System.out.println(result);
    }

    static int find (int n, int c) {
        if (n % 10 == n) {
            return c;
        } else {
            int rem = n % 10;
            if (rem == 0) {
                return find(n / 10, c + 1);
            } else {
                return find (n / 10, c);
            }
        }
    }
}
