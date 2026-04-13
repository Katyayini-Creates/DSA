package Array;

import java.util.ArrayList;
import java.util.List;

public class LC1431_GreatestCandies {
    public static void main(String[] args) {
        //Brute-Force as well as Optimal Approach
        int[] candies = {2, 3, 5, 1, 3};
        int extraCandies = 3;
        List<Boolean> ans = check(candies, extraCandies);
        System.out.println(ans);

    }
    static List<Boolean> check(int[] candies, int extraCandies) {
        int greatest = Integer.MIN_VALUE;
        List<Boolean> result = new ArrayList<Boolean>();
        for (int num : candies) {
            if (num > greatest) {
                greatest = num;
            }
        }

        for (int num : candies) {
            if (num + extraCandies >= greatest) {
                result.add(true);
            } else {
                result.add(false);
            }
        }
        return result;
    }
}
