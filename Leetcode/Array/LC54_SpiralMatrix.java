package Array;

import java.util.*;

public class LC54_SpiralMatrix {
    public static void main(String[] args) {
        //Optimal Approach
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };
        List<Integer> list = new ArrayList<>();

        int m = matrix.length;
        int n = matrix[0].length;

        int top = 0;
        int bottom = m - 1;
        int left = 0;
        int right = n - 1;

        while (top <= bottom && left <= right) {
            for (int col = left; col <= right; col++) {
                list.add(matrix[top][col]);
            }
            top++;

            for (int row = top; row <= bottom; row++) {
                list.add(matrix[row][right]);
            }
            right--;

            if (top <= bottom) {
                for (int col = right; col >= left ; col--) {
                    list.add(matrix[bottom][col]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int row = bottom; row >= top; row--) {
                    list.add(matrix[row][left]);
                }
                left++;
            }
        }
        System.out.println(list);
    }
}
//Brute-Force Approach
//class Solution {
//    public List<Integer> spiralOrder(int[][] matrix) {
//        List<Integer> list = new ArrayList<>();
//
//        int m = matrix.length;
//        int n = matrix[0].length;
//        boolean[][] visited = new boolean[m][n];
//
//        int[] dirR = {0, 1, 0, -1};
//        int[] dirC = {1, 0, -1, 0};
//
//        int row = 0;
//        int col = 0;
//        int dir = 0;
//        int t = m * n;
//        for (int i = 0; i < t; i++) {
//            list.add(matrix[row][col]);
//            visited[row][col] = true;
//
//            int newRow = row + dirR[dir];
//            int newCol = col + dirC[dir];
//
//            if (newRow < 0 || newRow >= m || newCol < 0 || newCol >= n || visited[newRow][newCol]) {
//                dir = (dir + 1) % 4;
//
//            }
//
//            row += dirR[dir];
//            col += dirC[dir];
//
//
//        }
//        return list;
//
//    }
//}
