package Searching;

import java.util.Arrays;

public class LC167_TwoSumType2 {
    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 14};
        int target = 9;
        int[] result = findIndices(numbers, target);
        System.out.println(Arrays.toString(result));
    }

    static int[] findIndices(int[] numbers, int target) {
        int n = numbers.length;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            int sum = 0;
            sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[] {left + 1, right + 1};
            } else if (sum > target) {
                right --;
            } else {
                left ++;
            }
        }
        return new int[] {-1, -1};
    }
}
