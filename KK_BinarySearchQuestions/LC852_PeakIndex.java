public class LC852_PeakIndex {
    public static void main(String[] args) {
        //Optimal Approach
        int[] arr = {1, 3, 5, 6, 7, 4, 2};
        int result = findPeak(arr);
        System.out.println(result);
    }

    static int findPeak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}

