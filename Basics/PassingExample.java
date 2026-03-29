import java.util.Arrays;

public class PassingExample {
    public static void main(String[] args) {
        String name = "Katyayini";
        change(name);
        System.out.println(name);

        int[] arr = {1, 2, 3, 4};
        change2(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(String naam) {  //copy of the value stored in reference variable (name) is stored in 'naam'
        naam = "Singh";
    }

    static void change2(int[] nums) {  //non-primitives are pass by value of reference
        nums[1] = 99;
    }
}
