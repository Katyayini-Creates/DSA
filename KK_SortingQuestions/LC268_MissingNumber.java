public class LC268_MissingNumber {
    public static void main(String[] args) {
        int[] nums = {4, 0, 2, 1};
        int n = nums.length;

        int missingNum = findMissingNum(nums, n);
        System.out.println(missingNum);
    }

    static int findMissingNum(int[] nums, int n) {
        int i = 0;
        while (i < n) {
            int num = nums[i];
            if (num < n && num != i) {
                int temp = nums[i];
                nums[i] = nums[num];
                nums[num] = temp;
            } else {
                i++;
            }
        }

        for (int j = 0; j < n; j++) {
            if (nums[j] != j) {
                return j;
            }
        }
        return n;
    }
}
