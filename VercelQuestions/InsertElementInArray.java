import java.util.Arrays;

public class InsertElementInArray {
    public static void main(String[] args) {
        int[] arr = new int[6];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 6;

        int size = 5;
        int index = 2;
        int element = 3;

        for(int i = size; i > index; i--) {
            arr[i] = arr[i-1];
        }
        arr[index] = element;

        System.out.println(Arrays.toString(arr));

    }
}
