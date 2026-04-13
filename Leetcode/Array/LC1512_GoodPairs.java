package Array;

import java.util.HashMap;

public class LC1512_GoodPairs {
    public static void main(String[] args) {
        //Optimal Approach
        int[] nums = {1, 2, 3, 1, 1, 3};
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int n : nums) {
            if(map.containsKey(n)) {
                count += map.get(n);
            }
            map.put(n, map.getOrDefault(n, 0) + 1);
        }
        System.out.println(count);
    }
}

//Brute-Force Approach
//class Solution {
//    public int numIdenticalPairs(int[] nums) {
//        int counter= 0;
//        for(int i=0; i<nums.length; i++)
//        {
//            for(int j=i+1; j<nums.length; j++)
//            {
//                if(nums[i]==nums[j])
//                    counter++;
//            }
//
//        }
//        return counter;
//    }
//}
