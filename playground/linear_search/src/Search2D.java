import java.util.Arrays;

public class Search2D {
    public static void main(String[] args) {
        int arr[][] = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9},
                {10, 11, 12}
        };
        int[] coord = search(arr, 8);

        if (coord.length != 0) {
            int i = coord[0];
            int j = coord[1];
            System.out.println(arr[i][j]);
            System.out.println(Arrays.toString(coord));
        }

        int max = max(arr);
        int maxE = maxEnhanced(arr);
        int min = min(arr);
        System.out.println(max);
        System.out.println(maxE);
        System.out.println(min);
    }
    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
           for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target)
                    return new int[]{row, col};
           }
        }
        return new int[]{};
    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row ++) {
            for (int col = 1; col < arr[row].length; col++) {
               if (max < arr[row][col])
                   max = arr[row][col];
            }
        }
        return max;
    }

    static int maxEnhanced(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] row : arr)
            for(int col : row)
                if (max < col)
                    max = col;

        return max;
    }

    static int min(int[][] arr) {
        int min = Integer.MAX_VALUE;
        for (int[] row : arr)
            for (int col : row)
                if (min > col)
                    min = col;

        return min;
    }
}
