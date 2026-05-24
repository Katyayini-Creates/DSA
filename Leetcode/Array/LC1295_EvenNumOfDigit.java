package Array;

public class LC1295_EvenNumOfDigit {
    public static void main(String[] args) {
        //Optimal Approach
        int[] nums = {12, 345, 2, 6, 7896};
        int count=0;
        for(int i=0; i<nums.length; i++)
        {
            int digitNum = (int) (Math.floor(Math.log10(nums[i])) + 1);
            if (digitNum % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}

//Brute-Force Approach
//class Solution {
//    public int findNumbers(int[] nums) {
//        int count=0;
//        for(int i=0; i<nums.length; i++)
//        {
//            int n= nums[i];
//            int digit= 0;
//            while(n!=0)
//            {
//                n=n/10;
//                digit++;
//            }
//            if(digit%2==0)
//                count++;
//        }
//        return count;
//
//    }
//}
