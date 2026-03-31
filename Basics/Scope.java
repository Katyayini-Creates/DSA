public class Scope {
    public static void main(String[] args) {
        int a = 10;
        {
//            int a = 100;  //same variable can't be reinitialized inside another block. (block scope)
//            a = 20; //value can be modified. (block scope)
//
//            int b = 90;
        }
//        b = 20;                  /*variable initialized inside an internal block can't be used outside. (block scope)*/
//        System.out.println(b);
//
//        System.out.println(num);  //variable of another method can't be directly used inside another method (method scope).
    }

    static void change(int c) {
        int num = 30;

        for(int i = 0; i <= 5; i++) {
            System.out.println(i);
        }
        // System.out.println(i);        //variable of/inside loop can't be used outside (loop scope).
    }
}
