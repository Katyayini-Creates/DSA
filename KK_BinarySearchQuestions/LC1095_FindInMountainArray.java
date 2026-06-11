import com.sun.jdi.PathSearchingVirtualMachine;

import static java.lang.System.exit;

public class LC1095_FindInMountainArray {
    public static void main(String[] args) {
        int[] mountainArr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        int length = mountainArr.length;
        int peak = findPeakElement(mountainArr, length);
        int firstTry = findTarget(mountainArr, target, 0, peak);
        if (firstTry != -1) {
            System.out.println(firstTry);
            //exit();
        }
        int secondTry = findTarget(mountainArr, target, peak + 1, length - 1);
        System.out.println(secondTry);;
    }
    static int findPeakElement(int[] arr, int length) {
        int start = 0;
        int end = length - 1;
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
    static int findTarget(int[] arr, int target, int start, int end) {
        boolean asc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (asc) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }
        return -1;
    }
}
