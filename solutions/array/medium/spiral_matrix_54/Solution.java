import java.util.ArrayList;
import java.util.List;


// Time Complexity: O(m*n)

class Solution {
    public static void main(String[] args) {
        int[][] matrix ={{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        ArrayList<Integer> ans = (ArrayList<Integer>) spiralOrder(matrix);
        System.out.println(ans.toString());
    }

    static List<Integer> spiralOrder(int[][] matrix) {
        ArrayList<Integer> ans = new ArrayList<>();

        int startCol = 0;
        int endCol = matrix[0].length - 1;
        int startRow = 0;
        int endRow = matrix.length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int i = startCol; i <= endCol; i++) {
                ans.add(matrix[startRow][i]);
            }
            startRow++;

            // right
            for (int i = startRow; i <= endRow; i++) {
                ans.add(matrix[i][endCol]);
            }
            endCol--;

            // bottom
            if (startRow <= endRow) {
                for (int i = endCol; i >= startCol; i--) {
                    ans.add(matrix[endRow][i]);
                }
                endRow--;
            }

            // left
            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    ans.add(matrix[i][startCol]);
                }
                startCol++;
            }
        }
        return ans;
    }
}
