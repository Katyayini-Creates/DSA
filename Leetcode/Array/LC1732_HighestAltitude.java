package Array;

public class LC1732_HighestAltitude {
    public static void main(String[] args) {
        //Optimal Approach
        int[] gain = {-5, 1, 5, 0, -7};
        int currentAltitude = 0;
        int maxAltitude = Integer.MIN_VALUE;

        for (int i = 0; i < gain.length; i++) {
            currentAltitude += gain[i];
            maxAltitude = Math.max(currentAltitude, maxAltitude);
        }
        System.out.println(maxAltitude);
    }
}

//Brute-Force Approach
//class Solution {
//    public int largestAltitude(int[] gain) {
//        int n = gain.length;
//        int[] altitude = new int[n + 1];
//        altitude[0] = 0;
//        for (int i = 0; i < n; i++) {
//            altitude[i + 1] = altitude[i] + gain[i];
//        }
//
//        int greatest = Integer.MIN_VALUE;
//        for (int i = 0; i < n + 1; i++) {
//            if (altitude[i] > greatest) {
//                greatest = altitude[i];
//            }
//        }
//        return greatest;
//    }
//}