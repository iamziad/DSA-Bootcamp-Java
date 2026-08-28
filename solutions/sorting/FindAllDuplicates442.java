import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FindAllDuplicates442 {
    public static void main(String[] args) {
        int nums[] = { 4, 3, 2, 7, 8, 2, 3, 1 };
        List<Integer> dups = findDuplicates(nums);
    }

    static List<Integer> findDuplicates(int[] nums) {
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

        System.out.println(Arrays.toString(nums));

        i = 0;
        ArrayList<Integer> dups = new ArrayList<>();
        while (i < nums.length) {
            if (nums[i] - 1 != i)
                dups.add(nums[i]);
            i++;
        }

        return dups;
    }
}

// nums = [4,3,2,7,8,2,3,1]
// [1, 2, 3, 4, 2, 2, 7, 8]
