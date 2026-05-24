package Array;

import java.util.*;

public class LC989_ArrayFormOfInteger {
    public static void main(String[] args) {
        //Optimal Approach
        int[] num = {2, 1, 5};
        int k = 806;
        List<Integer> list = new ArrayList<>();
        int i = num.length - 1;
        while (i >= 0 || k > 0) {
            if (i >= 0) {
                k += num[i];
                i--;
            }
            list.add(k % 10); //ans digit
            k /= 10; //carry
        }
        Collections.reverse(list);
        System.out.println(list);
    }
}

//Brute-Force Approach -> won't work for large inputs even after using long.
