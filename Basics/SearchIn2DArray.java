import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {5, 6, 9}
        };
        int target = 3;
        int[] result = search(arr, target);

        System.out.println(Arrays.toString(result));
    }
    static int[] search(int[][] arr, int target) {
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++) {
                if(arr[row][col] == target) {
                    return new int[] {row, col};
                }
            }
        }
        return new int[] {-1, -1};
    }
}
