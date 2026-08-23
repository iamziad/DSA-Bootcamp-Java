import java.util.Arrays;

class SortedMatrixContigous {
    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
        };

        int[] res = search(matrix, 10);
        int[] res2 = search(matrix, 8);
        int[] res3 = search(matrix, 3);
        int[] res4 = search(matrix, 5);

        System.out.println(Arrays.toString(res));
        System.out.println(Arrays.toString(res2));
        System.out.println(Arrays.toString(res3));
        System.out.println(Arrays.toString(res4));
    }

    static int[] search(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int start = 0;
        int end = (rows * cols) - 1;
        int[] res = { -1, -1 };

        while (start <= end) {
            int mid = start + (end - start) / 2;
            int row = mid / cols;
            int col = mid % cols;
            int el = matrix[row][col];

            if (target == el) {
                res[0] = row;
                res[1] = col;
                return res;
            } else if (target > el)
                start = mid + 1;
            else
                end = mid - 1;
        }

        return res;
    }

}
