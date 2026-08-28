import java.util.ArrayList;

class SetMismatch645 {
    public static void main(String[] args) {

    }

    public int[] findErrorNums(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIdx = nums[i] - 1;

            if (nums[i] != nums[correctIdx]) {
                int tmp = nums[i];
                nums[i] = nums[correctIdx];
                nums[correctIdx] = tmp;
            } else
                i++;
        }

        i = 0;
        while (i < nums.length) {
            if (nums[i] - 1 != i)
                return new int[] { nums[i], i + 1 };
            i++;
        }

        return new int[] { -1, -1 };
    }
}
