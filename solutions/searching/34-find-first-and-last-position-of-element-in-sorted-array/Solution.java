// 1. start search loop
// 2. if target is found set it in output[0] if it's -1, else, set it to output[1]
// key solution: run the binary search twice.
//    - first occurance always in left side
//    - last occurance always in right side

import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] nums1 = {5,7,7,8,8,10};
        int[] nums2 = {};
        int[] ans1 = searchRange(nums1, 8); // [3, 4]
        int[] ans2 = searchRange(nums1, 7); // [1, 2]
        int[] ans3 = searchRange(nums1, 3); // [-1, -1]
        int[] ans4 = searchRange(nums2, 3); // [-1, -1]
        System.out.println(Arrays.toString(ans1));
        System.out.println(Arrays.toString(ans2));
        System.out.println(Arrays.toString(ans3));
        System.out.println(Arrays.toString(ans4));
    }

    static public int[] searchRange(int[] nums, int target) {
        int[]  occur = {-1, -1};

        if (nums.length == 0)
            return occur;

        occur[0] = search(nums, target, true);
        occur[1] = search(nums, target, false);

        return occur;
    }

    static int search(int[] nums, int target, boolean first) {
        int start = 0;
        int end   = nums.length - 1;
        int occur = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == nums[mid]) {
                occur = mid;

                if (first == true)
                    end = mid - 1;
                else
                    start = mid + 1;
            }
            else if (target > nums[mid]) {
                start = mid + 1;
            }
            else
                end = mid - 1;
        }
        return occur;
    }
}
