package Array;

import java.util.Arrays;

public class LC1480_RunningSum {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int[] runningSum = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i]; //we can also write nums[i] = nums[i] + nums[i - 1]; for this start iterating from index 1.
            nums[i] = sum;
        }
        System.out.println(Arrays.toString(nums));
    }
}

//Brute-Force Approach
//class Solution {
//    public int[] runningSum(int[] nums) {
//        int[] runningSum= new int[nums.length];
//        int sum=0;
//        for(int i=0; i<nums.length;i++)
//        {
//            sum+=nums[i];
//            runningSum[i]=sum;
//        }
//        return runningSum;
//    }
//}