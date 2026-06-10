public class Pattern1 {
    public static void main(String[] args) {
        int n = 5;
        printPatternOne(n);
    }

    static void printPatternOne(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 4; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
