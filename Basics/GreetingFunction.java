import java.util.Scanner;

public class GreetingFunction {
    public static void main(String[] args) {
        greeting();
    }

    static void greeting() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the greeting message : ");
        String message = in.nextLine();
        System.out.println(message);
    }
}
