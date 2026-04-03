import java.util.Arrays;
import java.util.Scanner;

public class SwappingValuesArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the indices of which elements you want to get swapped : ");
        int index1 = sc.nextInt();
        int index2 = sc.nextInt();

        swap(arr, index1, index2);
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] nums, int i1, int i2) {
        int temp = nums[i1];
        nums[i1] = nums[i2];
        nums[i2] = temp;
    }
}
