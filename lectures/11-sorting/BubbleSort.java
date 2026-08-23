import java.util.Arrays;

class BubbleSort {
    public static void main(String[] args) {
        int[] nums = { 3, 1, 5, 4, 2 };
        int[] nums2 = { 1, 2, 3, 4, 5 };
        bubbleSort(nums);
        bubbleSort(nums2);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums2));
    }

    static void bubbleSort(int[] nums) {
        int i;
        for (i = 0; i < nums.length - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = tmp;
                    swapped = true;
                }
            }

            if (!swapped) {
                System.out.println(i + 1); // number of iterations took to sort
                return;
            }
        }

        System.out.println(i + 1); // number of iterations took to sort
    }
}
