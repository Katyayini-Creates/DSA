package Array;

import java.util.ArrayList;
import java.util.Arrays;

public class LC1380_LuckyNumberInMatrix {
    public static void main(String[] args) {
        //Optimal Approach
        int[][] matrix = {
                {3, 7, 8},
                {9, 11, 13},
                {15, 16, 17}
        };

        int m = matrix.length;
        int n = matrix[0].length;
        int[] rowMin = new int[m];
        int[] colMax = new int[n];

        Arrays.fill(rowMin, Integer.MAX_VALUE);
        Arrays.fill(colMax, Integer.MIN_VALUE);

        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                rowMin[r] = Math.min(rowMin[r], matrix[r][c]);
                colMax[c] = Math.max(colMax[c], matrix[r][c]);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int min : rowMin) {
            for (int max : colMax) {
                if (min == max) {
                    list.add(min);
                }
            }
        }
        System.out.println(list);
    }
}

//Brute-Force
//class Solution {
//    public List<Integer> luckyNumbers(int[][] matrix) {
//        ArrayList<Integer> list = new ArrayList<>();
//        int rowLength = matrix.length;
//        int colLength = matrix[0].length;
//        for (int i = 0; i < rowLength; i++) {
//            for (int j = 0; j < colLength; j++) {
//                int current = matrix[i][j];
//
//                boolean isMin = true;
//                boolean isMax = true;
//
//                //Min in row
//                for (int col = 0; col < colLength; col++) {
//                    if (matrix[i][col] < current) {
//                        isMin = false;
//                        break;
//
//                    }
//                }
//
//                //Max in col
//                for (int row = 0; row < rowLength; row++) {
//                    if (matrix[row][j] > current) {
//                        isMax = false;
//                        break;
//                    }
//                }
//
//                if (isMax && isMin) {
//                    list.add(current);
//                    break;
//                }
//            }
//        }
//        return list;
//    }
//}
