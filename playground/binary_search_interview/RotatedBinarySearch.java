/*
- the middle element in any rotated array will have a well sorted side and a
  and the rotated side itself.
- in the well sorted side, we can check if the target is within it's range or
    not.
- if it exist we search in this side, if not we search in the other side.
 */

class RotatedBinarySearch {
    public static void main(String[] args) {
        int[] nums1 = { 5, 6, 7, 1, 2, 3, 4 };
        int[] nums2 = { 1, 2 };
        int[] nums3 = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(rotatedBinarySearch(nums1, 5));
        System.out.println(rotatedBinarySearch(nums2, 1));
        System.out.println(rotatedBinarySearch(nums3, 1));
    }

    static int rotatedBinarySearch(int[] nums, int target) {
        int start = 0, end = nums.length - 1;

        while (start <= end) {
            int mid = Math.addExact(start, end) / 2;

            if (nums[mid] == target) {
                return mid;
            }

            if (nums[mid] >= nums[start]) {
                if (target >= nums[start] && target <= nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target >= nums[mid] && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}
