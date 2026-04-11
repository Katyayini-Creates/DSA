package Array;

import java.util.Arrays;

public class LC1929_ConcatArray {
    public static void main(String[] args) {
        //Brute-Force as well as Optimal Approach
        int[] nums = {1, 2, 1};
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = ans[i + n] = nums[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}

