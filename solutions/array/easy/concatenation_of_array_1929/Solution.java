import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        int[] ans = getConcatenation(nums);
        System.out.println(Arrays.toString(ans));
    }

    static int[] getConcatenation(int[] nums) {
        if (nums.length == 0)
            return new int[]{};

        int[] ans = new int[2 * nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = ans[i + nums.length] = nums[i];
        }

        return ans;
    }

}
