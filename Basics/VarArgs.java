import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2, 5, 6, 7, 9);
        multiple(2, 3, "Kunal", "DSA"); //variable length argument should be at last and order of arguments also matters
    }

    static void fun(int ...var){
        System.out.println(Arrays.toString(var));
    }

    static void multiple(int a, int b, String ...v) {
        System.out.println(a);
        System.out.println(b);
        System.out.println(Arrays.toString(v));
    }
}
