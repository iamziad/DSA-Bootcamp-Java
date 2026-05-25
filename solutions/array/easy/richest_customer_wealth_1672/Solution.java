class Solution {
    public static void main(String[] argv) {
        int[][] accounts = {{1,5},{7,3},{3,5}};
        int max = maximumWealth(accounts);
        System.out.println(max);
    }

    // NOTE O(n * m)
    static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;

        for (int[] row : accounts) {
            int sum = 0;

            for (int col : row)
                sum += col;

            if (sum > max)
                max = sum;
        }
        return max;
    }
}
