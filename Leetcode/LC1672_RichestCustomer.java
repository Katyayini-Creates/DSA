import java.util.Scanner;

public class LC1672_RichestCustomer {
    public static void main(String[] args) {
        //Brute-Force / Optimal Approach
        Scanner in = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] accounts = new int[n][m];

        System.out.print("Enter the elements in the array : ");
        for (int row = 0; row < accounts.length; row++) {
            for (int col = 0; col < accounts[row].length; col++) {
                accounts[row][col] = in.nextInt();
            }
        }

        int result = calcWealth(accounts);
        System.out.println("The wealth of the richest person = " + result);
    }

    static int calcWealth(int[][] accounts) {
        int richest = Integer.MIN_VALUE;
        for (int[] arr : accounts) {
            int sum = 0;
            for (int num : arr) {
                sum += num;
            }
            if (sum > richest) {
                richest = sum;
            }
        }
        return richest;
    }
}


