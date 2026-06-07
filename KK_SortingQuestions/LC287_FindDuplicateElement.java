public class LC287_FindDuplicateElement {
    public static void main(String[] args) {
        int[] nums = {3, 3, 3, 3};
        int result = findDuplicate(nums);
        System.out.println(result);
    }

    static int findDuplicate(int[] nums) {
        int n = nums.length;
        int i  = 0;
        while (i < n) {
            if (nums[i] != i + 1) {
                int num = nums[i];
                if (num != nums[num - 1]) {
                    int temp = nums[i];
                    nums[i] = nums[num - 1];
                    nums[num - 1] = temp;
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }
        }
        return -1;

    }
}
