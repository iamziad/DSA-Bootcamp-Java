import java.util.Arrays;

// leetcode 268

class MissingNumber268 {
    public static void main(String[] args) {
        int[] nums = { 3, 0, 1 };
        int missing = missingNumber(nums);
        System.out.println(missing);
    }

    static int missingNumber(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            int correctIdx = nums[i];

            if (nums[i] < nums.length && nums[i] != nums[correctIdx]) {
                int tmp = nums[i];
                nums[i] = nums[correctIdx];
                nums[correctIdx] = tmp;
            } else
                i++;
        }

        i = 0;
        while (i < nums.length) {
            if (nums[i] != i)
                return i;
            i++;
        }

        return nums.length;
    }
}
