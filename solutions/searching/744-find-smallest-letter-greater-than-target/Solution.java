// 1. define start, end
// 2. define mid, search loop
// 3. return start

class Solution {
    public static void main(String[] args) {
        char[] letters = {'x' ,'x', 'y', 'y'};
        System.out.println(nextGreatestLetter(letters, 'z'));
    }

    static public char nextGreatestLetter(char[] letters, char target) {
        if (target >= letters[letters.length - 1])
            return letters[0];

        int start = 0;
        int end   = letters.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target >= letters[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return letters[start];
    }
}
