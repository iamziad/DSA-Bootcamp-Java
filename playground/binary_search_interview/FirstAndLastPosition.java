class FirstAndLastPosition {
    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 3, 4 };
        int nums2[] = { 5, 7, 7, 8, 8, 10 };
        int[] ans = searchRange(nums, 3);
        int[] ans2 = searchRange(nums2, 8);
        System.out.println(ans2[0]);
        System.out.println(ans2[1]);
    }

    static int[] searchRange(int nums[], int target) {
        int[] ans = { -1, -1 };

        ans[0] = search(nums, target, true);
        ans[1] = search(nums, target, false);

        return ans;
    }

    static int search(int nums[], int target, boolean searchFirst) {
        int start = 0;
        int end = nums.length;
        int ans = -1;

        while (start <= end) {
            int mid = Math.addExact(start, end) / 2;

            if (target == nums[mid]) {
                ans = mid;

                if (searchFirst == true) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;
    }

}
