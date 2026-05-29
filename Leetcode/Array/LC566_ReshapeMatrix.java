package Array;

import java.util.Arrays;

public class LC566_ReshapeMatrix {
    public static void main(String[] args) {
        //Optimal Approach
        int[][] mat = {
                {1, 2},
                {3, 4}
        };
        int r = 1, c = 4;
        int m = mat.length;
        int n = mat[0].length;
        int[][] newMat = new int[r][c];

        if (m * n != r * c) {
            System.out.println(Arrays.deepToString(mat));
        }

        for (int i = 0; i < m * n; i++) {
            newMat[i/c][i%c] = mat[i/n][i%n];
        }
        System.out.println(Arrays.deepToString(newMat));
    }
}

//Brute-Force Approach
//class Solution {
//    public int[][] matrixReshape(int[][] mat, int r, int c) {
//        int m = mat.length;
//        int n = mat[0].length;
//
//        if (m * n != r * c) {
//            return mat;
//        }
//
//        int[][] newMat = new int[r][c];
//        int row = 0, col = 0;
//        for (int i  = 0; i < m; i++) {
//            for (int j = 0; j < n; j++) {
//                newMat[row][col] = mat[i][j];
//                col++;
//
//                if (col == c) {
//                    row++;
//                    col = 0;
//                }
//
//            }
//        }
//        return newMat;
//    }
//}
