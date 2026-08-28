class FindTheDuplicate287 {
    public static void main(String[] args) {
        int[] nums = { 1, 3, 4, 2, 2 };
        int m = findDuplicate(nums);
        System.out.println(m);
    }

    static int findDuplicate(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            int correctIdx = nums[i] - 1;

            if (i != correctIdx) {
                if (nums[i] != nums[correctIdx]) {
                    int tmp = nums[i];
                    nums[i] = nums[correctIdx];
                    nums[correctIdx] = tmp;
                } else
                    return nums[i];
            } else
                i++;
        }

        return -1;
    }

}

//
