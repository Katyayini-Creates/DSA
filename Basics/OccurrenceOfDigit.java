import java.util.Scanner;

public class OccurrenceOfDigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        System.out.print("Enter the digit to be counted: ");
        int target = in.nextInt();
        
        int count = 0;
        
        while(num != 0) {
            int digit = num % 10;
            if(digit == target) {
                count++;
            }
            num /= 10;
        }
        System.out.println("Number of occurrences of " + target + " = " + count);
    }
}
