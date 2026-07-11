class CeilingOfNumber {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int ans1 = ceilingOfNumber(arr, 15); // 5
        int ans2 = ceilingOfNumber(arr, 17); // 6
        int ans3 = ceilingOfNumber(arr, 4); // 2
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);
    }

    static int ceilingOfNumber(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
}
