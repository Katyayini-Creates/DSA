public class Pattern3 {
    public static void main(String[] args) {
        int n = 5;
        printPatternThree(n);
    }

    static void printPatternThree(int n) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
