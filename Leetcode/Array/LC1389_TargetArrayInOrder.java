package Array;

import java.util.*;

public class LC1389_TargetArrayInOrder {
    public static void main(String[] args) {
        //Another Approach (Brute-Force and this one has same time and space complexity)
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        int[] result = order(nums, index);
        System.out.println(Arrays.toString(result));
    }

    static int[] order(int[] nums, int[] index) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            list.add(index[i], (nums[i]));
        }

        int[] target = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            target[i] = list.get(i);
        }
        return target;
    }
}

//Brute-Force Approach
//class Solution {
//    public int[] createTargetArray(int[] nums, int[] index) {
//        int n = nums.length;
//        int[] target = new int[n];
//        int size = 0;
//        for (int i = 0; i < n; i++) {
//            int pos = index[i];
//
//            for(int j = size; j > pos; j--) {
//                target[j] = target[j - 1];
//            }
//
//            target[pos] = nums[i];
//            size++;
//        }
//        return target;
//    }
//}