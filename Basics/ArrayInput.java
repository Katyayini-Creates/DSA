import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
    public static void main(String[] args) {
        int[] arr = new int[2];
        arr[0] = 23;
        arr[1] = 44;
        System.out.println(Arrays.toString(arr));

        Scanner in = new Scanner(System.in);
        int[] brr = new int[5];
        for (int i = 0; i < 5; i++) {
            brr[i] = in.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            System.out.print(brr[i] + " ");
        }

        System.out.println();

        System.out.println(Arrays.toString(brr));

        System.out.println();

        for (int num : brr) {    //enhanced for loop or for each loop. "For every element in the array, print the element.
            System.out.print(num + " ");      //Here num represents elements of the array brr.
        }

//        System.out.println(brr[5]);   Index out of bound error.
    }
}
