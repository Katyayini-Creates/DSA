package Array;

public class LC26_RemoveDuplicates {
    public static void main(String[] args) {
        //Optimal
        int[] nums = {1, 1, 2, 2, 2, 3, 4};
        int n = nums.length;
        int j = 1;
        for (int i = 1; i < n; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        System.out.println(j);
    }
}
//Brute-Force
//class Solution {
//    public int removeDuplicates(int[] nums) {
//        int n = nums.length;
//        for (int i = 0; i < n - 1; i++) {
//            if (nums[i] == nums[i + 1]) {
//                for (int j = i + 1; j < n - 1; j++) {
//                    nums[j] = nums[j + 1];
//                }
//                n--;
//                i--;
//            }
//        }
//        return n;
//
//    }
//}
