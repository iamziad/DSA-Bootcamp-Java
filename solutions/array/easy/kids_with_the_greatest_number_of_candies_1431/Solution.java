import java.util.ArrayList;
import java.util.List;

class Solution {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,3};
        int extraCandies = 3;
        List<Boolean> ans = kidsWithCandies(candies, extraCandies);
        System.out.println(ans.toString());
    }

    static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        ArrayList<Boolean> res = new ArrayList<>();

        for (int i = 0; i < candies.length; i++) {
            int sum = candies[i] + extraCandies;
            Boolean isGreatest = true;

            for (int j = 0; j < candies.length; j++) {
                if (sum < candies[j])
                    isGreatest = false;
            }

            res.add(isGreatest);
        }

        return res;
    }
}
