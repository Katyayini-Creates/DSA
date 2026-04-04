import java.util.Arrays;
import java.util.HashMap;

public class LC1_TwoSum {
    public static void main(String[] args) {
        //Optimal Approach
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = findTarget(nums, target);
        System.out.println(Arrays.toString(result));
    }

    static int[] findTarget(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }
            map.put(nums[i], i);

        }
        return new int[]{-1, -1};
    }
}

//Brute-Force Approach
//int ans[] = new int[2];
//for (int i = 0; i < nums.length; i++) {
//   int sum = 0;
//   for (int j = i + 1; j < nums.length; j++) {
//       sum = nums[i] + nums[j];
//       if (sum == target) {
//           ans[0] = i;
//           ans[1] = j;
//           break;
//       }
//   }
//}
//return ans;
