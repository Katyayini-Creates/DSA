package Array;

import java.util.Arrays;

public class LC1470_ShuffleArray {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 3, 4, 7};
        int[] arr = new int[nums.length];
        int n = nums.length / 2;

        for (int i = 0; i < n; i++) {
            arr[2 * i] = nums[i];
            arr[2 * i + 1] = nums[i + n];
        }
        System.out.println(Arrays.toString(arr));
    }
}
