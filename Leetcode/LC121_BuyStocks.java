public class LC121_BuyStocks {
    public static void main(String[] args) {
        //Optimal Approach
        int[] prices = { 7, 1, 5, 3, 6, 4};
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : prices) {
            if(price < minPrice) {
                minPrice = price;
            }
            int profit = price - minPrice;
            if(profit > maxProfit) {
                maxProfit = profit;
            }
        }
        System.out.println(maxProfit);
    }
}

//Brute Force Approach
//class Solution {
//    public int maxProfit(int[] prices) {
//        int maxProfit = 0;
//
//        for (int i = 0; i < prices.length; i++) {
//            for (int j = i + 1; j < prices.length; j++) {
//                int profit = prices[j] - prices[i];
//
//                if (profit > maxProfit) {
//                    maxProfit = profit;
//                }
//            }
//        }
//
//        return maxProfit;
//    }
//}