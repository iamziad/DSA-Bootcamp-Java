// Bitonic/Mountain arrays are just like two arrays compined together in one array,
// left one is ascending order and right one is descending order, and (peak) is
// a separator between them.
// we can split them by finding the peak, then apply binary search to each one.

class MountainArray {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 4, 2, 1 };
        System.out.println(findInMountainArray(3, arr));
    }

    static int findInMountainArray(int target, int[] arr) {
        int start = 0;
        int end   = arr.length - 1;

        // find peak
        int peak = findPeak(arr, start, end);

        // search in left side (ascending)
        int searchLeft = search(target, arr, 0, peak);

        if (searchLeft != -1)
            return searchLeft;

        // search in right side (descending)
        return search(target, arr, peak + 1, end);
    }

    static int findPeak(int[] arr, int start, int end) {
        while (start < end) {
            int mid = Math.addExact(start, end) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    static int search(int target, int[] arr, int start, int end) {
        boolean isDescending = arr[start] > arr[end];

        while (start <= end) {
            int mid = Math.addExact(start, end) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isDescending) {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}
