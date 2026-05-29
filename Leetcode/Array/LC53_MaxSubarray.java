package Array;

public class LC53_MaxSubarray {
    public static void main(String[] args) {
        int[] nums = {5, 4, -1, 7, 8};
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;
        int runningSum = 0;

        for (int i = 0; i < n; i++) {
            runningSum += nums[i];
            maxSum = Math.max(maxSum, runningSum);
            if (runningSum < 0) {
                runningSum = 0;
            }
        }
        System.out.println(maxSum);
    }
}

//Brute-Force Approach   //won't be efficient for larger arrays.
//class Solution {
//    public int maxSubArray(int[] nums) {
//        int maxSum = Integer.MIN_VALUE;
//        int n = nums.length;
//        int sum;
//
//        if (n == 1) {
//            return nums[0];
//        }
//
//        for (int i = 0; i < n; i++) {
//            sum = 0;
//            for (int j = i; j < n; j++) {
//                sum += nums[j];
//                if (sum > maxSum) {
//                    maxSum = sum;
//                }
//            }
//        }
//        return maxSum;
//    }
//}
