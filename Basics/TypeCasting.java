public class TypeCasting {
    public static void main(String[] args) {
//        byte a=20;
//        a=a*100; //the value of a*100 is int so cant stored in byte.

//int c= 257;
//byte d= (byte) c;    //range of byte= 256, cant store 257. therefore gives 257%256 i.e. 1 as output.
//        System.out.println(d);

//        int num= 'A';  // 'A' promoted to integer.
//        System.out.println(num);

        byte b=42;
        char c='a';
        short s= 1024;
        int i= 50000;
        float f= 5.67f;
        double d= 0.1234;
        double result=(f*b)+(i/c)-(d*s);
        System.out.println((f*b)+" "+(i/c)+" "+(d*s));
        System.out.println(result);
    }
}
