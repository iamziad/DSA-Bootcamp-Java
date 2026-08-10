// It's like a reversed binary search, instead of starting with big chunk and
// shrinking it, we start with small chunk and extending it.
// Time Complexity remains O(logn)

class InfiniteArray {
    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 7, 11, 13, 15};
        System.out.println(infiniteArray(arr, 13));
    }

    static int infiniteArray(int[] arr, int target) {
        int start = 0;
        int end   = 1;

        while (target > arr[end]) {
            start = end + 1;
            end = Math.multiplyExact(start, 2) + 1;
        }

        return binarySearch(arr, target, start, end);
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
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

        return -1;
    }
}
