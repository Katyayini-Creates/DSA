import java.util.Scanner;

public class AlphabetCaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("enter a character: ");
        char ch = in.next().trim().charAt(0); /* trim method removes spaces at the start and end of a string.
                                                 charAt gives us the character type since .next() and .trim()
                                                 gives string types */


        if (ch >= 'A' && ch <= 'Z'){
            System.out.println("entered character is an uppercase letter.");
        } else if (ch >= 'a' && ch <= 'z'){
            System.out.println("entered character is a lowercase letter.");
        }
    }
}
