package Array;

import java.util.*;

public class LC1365_SmallerThanCurrent {
    public static void main(String[] args) {
        //Optimal Solution
        int[] nums = {8, 1, 2, 2, 3};
        int n = nums.length;

        int[] result = findSmaller(nums, n);
        System.out.println(Arrays.toString(result));
    }

    static int[] findSmaller(int[] nums, int n) {
        int[] sorted = nums.clone();
        Arrays.sort(sorted);

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (!map.containsKey(sorted[i])) {
                map.put(sorted[i], i);
            }
        }
        for (int i = 0; i < n; i++) {
            nums[i] = map.get(nums[i]);
        }
        return nums;
    }
}

//Brute-Force Approach
//class Solution {
//    public int[] smallerNumbersThanCurrent(int[] nums) {
//        int[] result = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            int counter = 0;
//            for (int j = 0; j < nums.length; j++) {
//                if (nums[i] > nums[j])
//                    counter++;
//            }
//            result[i] = counter;
//        }
//        return result;
//    }
//}
