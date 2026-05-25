public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {2, 4, -16, 25, 6};
        int target = -16;
        int from = 1;
        int to = 3;
        System.out.println(searchInRange(arr, from, to, target));
    }
    static boolean searchInRange(int[] arr, int from, int to, int target) {
        if (arr.length == 0)
            return false;
        for (int i = from; i <= to; i++) {
            if (arr[i] == target)
                return true;
        }
        return false;
    }
}
