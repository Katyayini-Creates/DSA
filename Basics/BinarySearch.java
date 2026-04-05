public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 11, 20, 21};
        int target = 89;

        int result = binSearch(arr, target);
        if(result != -1) {
            System.out.println("The target element is found at index = " + result);
        } else {
            System.out.println("The target element is not found.");
        }
    }
    static int binSearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if(target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
