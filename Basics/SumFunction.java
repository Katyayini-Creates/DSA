import java.util.Scanner;

public class SumFunction {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers : ");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int result = sum(num1, num2);
        System.out.println("The sum of two entered numbers = " + result);
    }

    static int sum(int a, int b) {                        //Anything you want to use in static has to be static.
        return a + b;
    }
}
