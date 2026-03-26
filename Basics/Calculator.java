import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        while(true) {
            Scanner in = new Scanner(System.in);
            System.out.print("Enter two numbers : ");
            int a = in.nextInt();
            int b = in.nextInt();

            System.out.print("Enter the desired operation (enter X to end the calculation : ");
            char op = in.next().trim().charAt(0);

            if(op == 'X' || op == 'x') {
                break;
            }

            int result = 0;

            if(op == '+') {
                result = a +b;
            } else if(op == '-') {
                result = a - b;
            } else if(op == '*') {
                result = a * b;
            } else if(op == '/') {
                result = a / b;
            } else if(op == '%') {
                result = a % b;
            }
            System.out.println("The result of performing operation "+ op + " on the numbers " +
                    a + " and " + b + " = " + result);
        }
        System.out.println("Calculator program ended.");
    }
}
