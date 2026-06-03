package Array;

public class LC1217_MinChipCost {
    public static void main(String[] args) {
        //Optimal Approach
        int[] position = {1, 2, 2};
        int oddCount = 0;
        int evenCount = 0;

        for (int pos : position) {
            if (pos % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println(Math.min(oddCount, evenCount));
    }
}
//Brute Force Approach
//class Solution {
//    public int minCostToMoveChips(int[] position) {
//        int n = position.length;
//        int minCost = Integer.MAX_VALUE;
//        for (int target : position) {
//            int cost = 0;
//            for (int current : position) {
//                if (target % 2 != current % 2) {
//                    cost++;
//                }
//            }
//            minCost = Math.min(cost, minCost);
//        }
//        return minCost;
//    }
//}