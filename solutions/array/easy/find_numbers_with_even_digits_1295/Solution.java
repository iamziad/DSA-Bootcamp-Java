import java.util.Arrays;

class Solution {
    public static void main(String[] argv) {
        int[] nums = {12,345,2,6,7896};
        int ans = findNumbers2(nums);
        System.out.println(ans);
    }

    // NOTE O(nlog10(m))
    static int findNumbers(int[] nums) {
        int evenCount = 0;

        for (int num : nums)
            if (isEvenDigit(num))
                evenCount++;

        return evenCount;
    }

    // NOTE O(log10(n))
    static boolean isEvenDigit(int digit) {
        int count = 0;

        while(digit > 0) {
            digit /= 10;
            count++;
        }

        if (count % 2 == 0)
            return true;

        return false;
    }

    // NOTE O(n)
    static int findNumbers2(int[] nums) {
        int evenCount = 0;

        for (int num : nums) {
            if (isEvenDigit2(num))
                evenCount++;
        }

        return evenCount;
    }

    // NOTE O(1)
    static boolean isEvenDigit2(int digit) {
        if (digit == 0)
            return false;

        if (digit < 0)
            digit *= -1;

        int numOfDigits = (int)Math.log10(digit) + 1;
        return numOfDigits % 2 == 0;
    }
}
