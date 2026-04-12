public class FloorOfNum {
    public static void main(String[] args) {
        int[] arr = {1, 5, 9, 10, 20, 21};
        int target = 20;
        int result = findFloor(arr, target);
        System.out.println(result);
    }

    static int findFloor(int[] arr, int target) {
        if (target < arr[0]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return arr[mid];
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return arr[end];
    }
}
