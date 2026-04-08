import java.util.Arrays;

public class DeleteEleFromArray {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int pos = 2;

        int result = deleteElement(arr, pos);
        for (int i = 0; i < result; i++) {
            System.out.println(arr[i]);
        }
    }
    static int deleteElement(int[] arr, int pos) {
        int size = arr.length;
        for(int i = pos; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        return size - 1;
    }
}
