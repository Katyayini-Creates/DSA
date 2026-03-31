public class PrintArmstrong {
    public static void main(String[] args) {
        System.out.print("Three digit armstrong numbers = ");
        for (int i = 100; i <= 999; i++) {
            int result = armstrong(i);

            if (result != 0) {
                System.out.print(i + ", ");
            }
        }
    }
    static int armstrong(int num) {
        int s = 0;
        int n = num;
        while (n != 0) {
            int r = n % 10;
            s += r * r * r;
            n /= 10;
        }
        if (s == num)
            return num;
        else
            return 0;
    }
}
