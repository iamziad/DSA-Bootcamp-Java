import java.util.Arrays;

class FindMissingPositive {
    public static void main(String[] args) {
        int[] nums = { 3 };
        int sol = firstMissingPositive(nums);
        System.out.println(sol);
    }

    static int firstMissingPositive(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            int correctIdx = nums[i] - 1;

            if (nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correctIdx]) {
                int tmp = nums[i];
                nums[i] = nums[correctIdx];
                nums[correctIdx] = tmp;
            } else
                i++;
        }

        i = 0;
        while (i < nums.length) {
            if (nums[i] - 1 != i)
                return i + 1;
            i++;
        }

        return nums.length;
    }
}
