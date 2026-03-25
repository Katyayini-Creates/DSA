import java.util.Scanner;

public class PrintFibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of terms till which you want the fibonacci series (from index-0): ");
        int term = in.nextInt();

        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);

        for(int i = 2; i <= term; i++) {
            int c = a + b;
            System.out.println(c);

            a = b;
            b = c;
        }
    }
}
