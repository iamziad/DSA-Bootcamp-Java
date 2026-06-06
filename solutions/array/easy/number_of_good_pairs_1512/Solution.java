import java.util.HashMap;

class Solution {
    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};
        System.out.println(numIdenticalPairs(nums));
    }


    // O(n) - fast and uses the comination formula (nCr) for pairs (r = 2)
    static int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int goodPairs = 0;

        for (int num : nums)
            freq.put(num, freq.getOrDefault(num, 0) + 1);

        for (int count : freq.values())
            goodPairs += count * (count - 1) / 2;

        return goodPairs;
    }

    // O(n^2) - basic and easy but slow
    static int numIdenticalPairsSlow(int[] nums) {
        int goodPairs = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j])
                    goodPairs++;
            }
        }

        return goodPairs;
    }
}
