/*
  Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]

* 189. Rotate Array - https://leetcode.com/problems/rotate-array/

- NOTE
  - Reverse whole array        -> [ *7, 6, 5, 4, 3, 2, 1* ]
  - Reverse first *k* numbers  -> [ *5, 6, 7*, 4, 3, 2, 1 ]
  - Reverse last *n-k* numbers -> [ 5, 6, 7, *1, 2, 3, 4* ]
  - k = k % nums.length is the most important statement in the entire code because
    if k > nums.length, the reverse() function will go out of bound,
    the modulo will reduce the *k* so not to exceed the nums.length
*/
import java.util.Arrays;

class Solution {
    public static void main(String args[]) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rotate(arr, 3);
        System.out.println(Arrays.toString(arr));
    }

    static void rotate(int[] nums, int k) {
        k = k % nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    static void reverse(int[] nums, int s, int e) {
        while (s < e) {
            int tmp = nums[s];
            nums[s] = nums[e];
            nums[e] = tmp;
            s++;
            e--;
        }
    }

    // Simpler solution but consumes more memory
    // The gotcha of rotation is reduce k with module
     static void rotate2(int[] nums, int k) {
        int[] res = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            res[(i + k) % nums.length] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = res[i];
        }

    }
}
