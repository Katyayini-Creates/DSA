import java.util.Scanner;

public class LC1295_NumEvenDigits {
    public static void main(String[] args) {
        //Optimal Approach
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = in.nextInt();

        int[] nums = new int[size];
        System.out.print("Enter array elements : ");
        for (int i = 0; i < size; i++) {
            nums[i] = in.nextInt();
        }
        int count = 0;
        for (int i = 0; i < size; i++) {
            int digits = findDigits(nums[i]);
            if (digits % 2 == 0) {
                count++;
            }
        }
        System.out.println("The number of the numbers having even number of digits = " + count);
    }
    static int findDigits(int element) {
            return (int) (Math.log10(element)) + 1;
        }
    }

//    Brute-Force Approach
//int count = 0;
//for (int i = 0; i < size; i++) {
//    int digits = 0;
//    while (nums[i] != 0) {
//        nums[i] /= 10;
//        digits++
//        }
//    if (digits % 2 == 0) {
//        count++;
//        }
//        }
//System.out.print("The number of numbers having even number of digits = " + count);
