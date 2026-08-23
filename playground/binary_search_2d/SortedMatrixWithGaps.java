/*
  NOTE: The search mechanism is similar to binary search,
  but the time complexity is O(n) because the worst case here is at the (33)
  element where we have to move n + n times which 2n => O(n).
 */

import java.util.Arrays;

class SortedMatrixWithGaps {
    public static void main(String[] args) {
        int[][] matrix = {
                { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 28, 29, 37, 49 },
                { 33, 34, 38, 50 },
        };

        int[] res = search(matrix, 29);
        int[] res2 = search(matrix, 40);
        int[] res3 = search(matrix, 50);
        int[] res4 = search(matrix, 33);
        System.out.println(Arrays.toString(res));
        System.out.println(Arrays.toString(res2));
        System.out.println(Arrays.toString(res3));
        System.out.println(Arrays.toString(res4));
    }

    static int[] search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix.length - 1;
        int[] res = { -1, -1 };

        while (r < matrix.length && c >= 0) {
            if (target == matrix[r][c]) {
                res[0] = r;
                res[1] = c;
                return res;
            } else if (target > matrix[r][c])
                r++;
            else
                c--;
        }

        return res;
    }
}
