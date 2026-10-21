public class LC1342_CountSteps {
    public static void main(String[] args) {
        int num = 14;
        int count = 0;
        int result = helper (num, count);
        System.out.println(result);
    }

    static int helper (int n, int c) {
        if (n == 0) {
            return c;
        }
        else if (n % 2 == 0) {
            return helper(n / 2, c + 1) ;
        } else {
            return helper(n - 1, c + 1);
        }
    }
}
