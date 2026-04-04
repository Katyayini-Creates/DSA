public class MaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {5, 6, 9}
        };
        int max = arr[0][0];
        int result = search(arr, max);

        System.out.println("The maximum element is " + result);
    }
    static int search(int[][] arr, int max) {
        for(int[] a : arr) {
            for(int b : a){
                if(b > max) {
                    max = b;
                }
            }
        }
        return max;
    }
}
