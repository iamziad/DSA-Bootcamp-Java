import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class FindAllNumbers448 {
    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
        ArrayList<Integer> missings = (ArrayList<Integer>) findDisappearedNumbers(nums);
        System.out.println(missings);
    }

    static List<Integer> findDisappearedNumbers(int[] nums) {
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

        System.out.println("sorted " + Arrays.toString(nums) + " ");

        i = 0;
        ArrayList<Integer> missings = new ArrayList<>();
        while (i < nums.length) {
            int elementVal = nums[i];

            if (nums[i] - 1 != i)
                missings.add(i + 1);
            i++;
        }

        return missings;
    }
}


// nums = [4,3,2,7,8,2,3,1]
// [1, 2, 2, 3, 3, 4, 7, 8]
