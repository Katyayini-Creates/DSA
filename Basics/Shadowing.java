public class Shadowing {
    static int x = 90;     //this will be shadowed at line 8.

    public static void main(String[] args) {
        System.out.println(x);
        int x = 40;   //this will shadow the class variable at line 8.
        System.out.println(x);
        fun();
    }

    public static void fun() {
        System.out.println(x);
    }
}
