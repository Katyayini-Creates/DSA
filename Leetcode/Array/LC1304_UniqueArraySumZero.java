package Array;

import java.util.Arrays;

public class LC1304_UniqueArraySumZero {
    public static void main(String[] args) {
        //Brute as well as Optimal Approach
        int n = 4;
        int index = 0;
        int[] ans = new int[n];
        if (n % 2 != 0) {
            ans[index] = 0;
            index++;
        }
        for (int num = 1; index < n; num++) {
            ans[index++] = num;
            ans[index++] = -(num);
        }
        System.out.println(Arrays.toString(ans));
    }
}
