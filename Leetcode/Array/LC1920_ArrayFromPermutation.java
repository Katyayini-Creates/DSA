package Array;

import java.util.Arrays;

public class LC1920_ArrayFromPermutation {
    public static void main(String[] args) {
        //Optimal Approach
        int[] nums = {5, 0, 1, 2, 3, 4};
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] + n * (nums[nums[i]] % n);
        }
        for (int i = 0; i < n; i++) {
            nums[i] = nums[i] / n;
        }
        System.out.println(Arrays.toString(nums));
    }
}

//Brute-Force Approach
//int[] ans = new int[nums.length];
//for (int i = 0; i < nums.length; i++) {
//  ans[i] = nums[nums[i]];
//}
//return ans;
