package Array;

import java.util.Arrays;

public class LC867_TransposeOfMatrix {
    public static void main(String[] args) {
        //Optimal as well as Brute-Force Approach
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6}
        };
        int rowSize = matrix.length;
        int colSize = matrix[0].length;
        int[][] newMat = new int[colSize][rowSize];

        for (int row = 0; row < rowSize; row++) {
            for (int col = 0; col < colSize; col++) {
                newMat[col][row] = matrix[row][col];
            }
        }
        System.out.println(Arrays.deepToString(newMat));
    }
}

