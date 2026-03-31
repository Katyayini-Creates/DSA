import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num = in.nextInt();

        boolean result = check(num);

        if(result)
            System.out.println("Entered number is prime.");
        else
            System.out.println("Entered number is not prime.");
    }
    static boolean check(int num) {
        int c = 0;
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                c++;
                break;
            }
        }
        if(c > 0)
            return false;
        else
            return true;
    }
}
