class Sol {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};

        int res = mountain(arr, 10);
        int peek = findPeak(arr);
        System.out.println(peek);
    }


    static int findPeak(int[] nums) {
        int start = 0;
        int end = nums.length;

        while (start <= end) {
            int mid = Math.addExact(start, end) / 2;

            if (nums[mid] > nums[mid + 1]) {
                return mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    static int mountain(int[] nums, int target) {

        return 0;
    }
}
