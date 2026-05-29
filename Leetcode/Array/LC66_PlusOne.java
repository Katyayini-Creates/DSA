package Array;

import java.util.Arrays;

public class LC66_PlusOne {
    public static void main(String[] args) {
        //Brute-Force as well as Optimal Approach
        int[] digits = {9};
        int n = digits.length;
        int[] result = new int[n + 1];
        int k = 1;
        int i = n - 1;
        while (k > 0 || i >= 0) {
            if (i >= 0) {
                k += digits[i];
            }

            result[i + 1] = k % 10;
            k /= 10;
            i--;
        }
        int[] ans = new int[n];

        if (result[0] == 0) {
            for (int j = 0; j < n; j++) {
                ans[j] = result[j + 1];
            }
            System.out.println(Arrays.toString(ans));
        } else {
            System.out.println(Arrays.toString(result));
        }
    }
}
