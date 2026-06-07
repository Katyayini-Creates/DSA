import java.util.ArrayList;
import java.util.List;

public class LC448_FindAllMissingNumbers {
    public static void main(String[] args) {
        int[] nums = {1, 1};
        int n = nums.length;

        List<Integer> result = findNums(nums, n);
        System.out.println(result);
    }


    static List<Integer> findNums(int[] nums, int n) {

        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < n) {
            int num = nums[i];
            if (num - 1 != i  && num != nums[num - 1]) {
                int temp = nums[i];
                nums[i] = nums[num - 1];
                nums[num - 1] = temp;
            } else {
                i++;
            }
        }

        for (int index = 0; index < n; index++) {
            if (nums[index] != index + 1) {
                list.add(index + 1);
            }
        }
        return list;
    }
}
