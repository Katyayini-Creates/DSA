package Array;

import java.util.Arrays;

public class LC1886_RotateMatrix {
    public static void main(String[] args) {
        //Optimal Approach
        int[][] mat = {
                {0, 0, 0},
                {0, 1, 0},
                {1, 1, 1}
        };
        int[][] target = {
                {1, 1, 1},
                {0, 1, 0},
                {0, 0, 0}
        };
        for (int i = 0; i < 4; i++) {
            if (isEqual(mat, target)) {
                System.out.println(true);
                return;
            }
            rotate(mat);
        }
        System.out.println(false);

    }
    static void rotate(int[][] mat) {
        //Transpose
        for (int i = 0; i < mat.length; i++) {
            for (int j = i; j < mat[i].length; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }
        //Reverse
        for (int[] rows : mat) {
            int right = mat.length - 1;
            int left = 0;
            while (right > left) {
                int temp = rows[right];
                rows[right] = rows[left];
                rows[left] = temp;
                right--;
                left++;
            }
        }
    }
    static boolean isEqual(int[][] mat, int[][] target) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] != target[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
//Brute-Force
//class Solution {
//    public boolean findRotation(int[][] mat, int[][] target) {
//        for (int i = 0; i < 4; i++) {
//            if (isEqual(mat, target)) {
//                return true;
//            }
//            mat = rotateMat(mat);
//        }
//        return false;
//    }
//
//    int[][] rotateMat(int[][] mat) {
//        int n = mat.length;
//        int[][] rotated = new int[n][n];
//
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                rotated[j][n - i - 1] = mat[i][j];
//            }
//        }
//        return rotated;
//    }
//
//    boolean isEqual(int[][] mat, int[][] target) {
//        int n = mat.length;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < n; j++) {
//                if (mat[i][j] != target[i][j]) {
//                    return false;
//                }
//            }
//        }
//        return true;
//    }
//}
