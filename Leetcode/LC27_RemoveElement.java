public class LC27_RemoveElement {
    public static void main(String[] args) {
        //Optimal Approach
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }
        System.out.println(k);
    }
}

//Brute Force Approach
//int[] nums = {3, 2, 2, 3};
//int val = 3;
//int size = nums.length;
//        for(int i = 0; i < size; i++) {
//        if(nums[i] == val) {
//        for(int j = i; j < size - 1; j++){
//nums[j] = nums[j + 1];
//        }
//size--;
//i--;
//        }
//        }
//        System.out.println(size);
