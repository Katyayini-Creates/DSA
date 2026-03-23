import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        float tempC = input.nextFloat();

        float tempF = tempC * 1.8f + 32;
        System.out.println("The temperature in Fahrenheit = " + tempF);
    }

}
