import java.util.Arrays;

public class LC34_FirstLastOccurence {
    public static void main(String[] args) {
        //Optimal Approach
        int[] nums = {5, 7, 7, 7, 8, 8, 10};
        int target = 7;
        int first = findIndex(nums, target, true);
        int last = findIndex(nums, target, false);
        int[] result = {first, last};
        System.out.println(Arrays.toString(result));
    }

    static int findIndex(int[] nums, int target, boolean findFirst) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > target) {
                end = mid -1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                ans = mid;
                if (findFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }
        }
        return ans;
    }
}

//Brute-Force Approach
//class Solution {
//    public int[] searchRange(int[] nums, int target) {
//        int first = -1, last = -1;
//        int n = nums.length;
//        for (int i = 0; i < n; i++) {
//            if(nums[i] == target) {
//                first = i;
//                break;
//            }
//        }
//        for ( int j = n - 1; j > -1; j--) {
//            if (nums[j] == target) {
//                last = j;
//                break;
//            }
//        }
//        return new int[] {first, last};
//    }
//}
