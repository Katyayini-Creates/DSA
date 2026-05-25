package Array;

import java.util.Arrays;
import java.util.HashMap;

public class LC1_TwoSum {
    public static void main(String[] args) {
        //Optimal Approach
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int index = 0; index < nums.length; index++) {
           int diff = target - nums[index];
           if (map.containsKey(diff)) {
               ans[0] = map.get(diff);
               ans[1] = index;
               break;
            }
           else {
               map.put(nums[index], index);
           }
        }
        System.out.println(Arrays.toString(ans));
    }
}
//Brute-Force
//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//        int ans[] = new int[2];
//        for (int i = 0; i < nums.length; i++) {
//            int sum = 0;
//            for (int j = i + 1; j < nums.length; j++) {
//                sum = nums[i] + nums[j];
//                if (sum == target) {
//                    ans[0] = i;
//                    ans[1] = j;
//                    break;
//                }
//            }
//        }
//        return ans;
//    }
//}