import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 3, 4, 7};
        int[] ans = shuffle(arr, 3);
        System.out.println(Arrays.toString(ans));
    }

    static int[] shuffle(int[] nums, int n) {
        int len = 2 * n;
        int[] arr = new int[len];
        int a1 = 0;
        int a2 = n;

        int i = 0;
        while(a2 <= len - 1) {
            arr[i] = nums[a1];
            arr[i + 1] = nums[a2];
            a1++;
            a2++;
            i+=2;
        }

        return arr;
    }
}
