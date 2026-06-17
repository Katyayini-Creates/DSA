package Searching;

public class LC69_SquareRoot {
    public static void main(String[] args) {
        int x = 8;
        int result = findSquareRoot(x);
        System.out.println(result);
    }

    static int findSquareRoot(int x) {
        long start = 0;
        long end = x;
        while (start <= end) {
            long mid = start + (end - start) / 2;
            long m = mid * mid;
            if (m == x) {
                return (int) (mid);
            } else if (m < x) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return (int) (end);
    }
}
