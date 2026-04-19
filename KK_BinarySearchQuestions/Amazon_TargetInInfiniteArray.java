public class Amazon_TargetInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 6, 7, 8, 10, 11, 12, 15, 20, 23, 30};
        int target = 15;

        int result = ans(arr, target);
        System.out.println(result);
    }

    static int ans(int[] arr, int target) {
        int start = 0;
        int end = 1;

        while (end < arr.length && target > arr[end]) {
            int newStart = end + 1;
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return BinarySearch(arr, target, start, end);
    }

    static int BinarySearch(int[] arr, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > target) {
                end = mid - 1;
            } else if (arr[mid] < target) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
