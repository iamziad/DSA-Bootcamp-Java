public class Main {
    public static void main(String[] args) {
        int[] nums = {23, 45, 1, 2, 8, 19, -3, 16, -11, 28};
        int target = 19;
        int ret = linearSearch(nums, target);
        System.out.println(ret);
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0)
            return -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }
}