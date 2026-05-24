package Array;

public class LC1572_SumOfDiagonals {
    public static void main(String[] args) {
        //Optimal Approach
        int sum = 0;
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int n = matrix.length;
        for (int i = 0; i < n; i++) {
            sum += matrix[i][i];
            if (i != n - i - 1) {
                sum += matrix[i][n - i - 1];
            }
        }
        System.out.println(sum);
    }
}

//Brute-Force Approach
//class Solution {
//    public int diagonalSum(int[][] mat) {
//        int sum = 0;
//        for (int i = 0; i < mat.length; i++) {
//            for (int j = 0; j < mat[i].length; j++) {
//                if (i == j || (i + j) == mat.length - 1) {
//                    sum += mat[i][j];
//                }
//            }
//        }
//        return sum;
//    }
//}
