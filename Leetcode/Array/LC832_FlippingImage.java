package Array;

import java.util.Arrays;

public class LC832_FlippingImage {
    public static void main(String[] args) {
        //Brute-Force as well as Optimal Approach
        int[][] image = {{1, 1, 0}, {1, 0, 1}, {0, 0, 0}};
        int[][] result = flip(image);
        System.out.println(Arrays.deepToString(result));
    }


    static int[][] flip(int[][] image) {
        for (int k = 0; k < image.length; k++) {
            int i = 0;
            int j = image[k].length - 1;

            while (i <= j) {
                int temp = image[k][i];
                image[k][i] = image[k][j];
                image[k][j] = temp;

                if (image[k][i] == 1) {
                    image[k][i] = 0;
                } else {
                    image[k][i] = 1;
                }

                if (i != j) {
                    if (image[k][j] == 1) {
                        image[k][j] = 0;
                    } else {
                        image[k][j] = 1;
                    }
                }
                i++;
                j--;
            }

        }
        return image;
    }
}

//Another Approach (using Bit Manipulation for inversion)
//   class Solution {
//       public int[][] flipAndInvertImage(int[][] image) {
//           for (int[] row : image) {
//               int left = 0, right = row.length - 1;
//
//               while (left <= right) {
//                   int temp = row[left];
//                   row[left] = 1 - row[right];
//                   row[right] = 1 - temp;
//
//                   left++;
//                   right--;
//               }
//           }
//
//           return image;
//       }
//   }

