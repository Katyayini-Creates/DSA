public class Overloading {
    public static void main(String[] args) {
        demo(1, 10);
        demo(5, 6, 7);
    }
    static void demo(int a, int b) {                   //Different number of arguments or different types
        System.out.println(a);
        System.out.println(b);
        System.out.println();
    }
    static void demo(int a, int b, int c) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

