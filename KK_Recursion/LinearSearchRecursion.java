public class LinearSearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1, 3, 14, 15, 56};
        int target = 15;
        int index = 0;
        int result = search (arr, target, index);
        System.out.println(result);
    }

    static int search (int[] arr, int target, int i) {
        if (i == arr.length) {
            return -1;
        } else if (arr[i] == target) {
            return i;
        } else {
            return search (arr, target, i + 1);
        }
    }
}
