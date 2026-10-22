public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 13, 4};
        int index = 0;
        System.out.println(sorted(arr, index));
    }

    static boolean sorted (int[] arr, int i) {
        if (i == arr.length - 1) {
            return true;
        } else {
            return arr[i] < arr[i + 1] && sorted (arr, i + 1);
        }
    }
}
