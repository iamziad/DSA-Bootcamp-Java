// * Binary Search
// * Time Complexity: O(logn), because we are dividing arrays
//   till it has only 1 element.

class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] arr2 = {4, 3, 2, 1};
        System.out.println(binarySearchOA(arr, 4));   // 3
        System.out.println(binarySearchOA(arr2, 4));  // 0
        System.out.println(binarySearchOA(arr, 2));  //  1
        System.out.println(binarySearchOA(arr2, 2)); //  2
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return mid;
            else if (arr[mid] > target)
                end = mid - 1;
            else
                start = mid + 1;
        }

        return -1;
    }

    // * Order agnostic version, works on both asc/desc order
    static int binarySearchOA(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                if (isAsc == true)
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {
                if (isAsc == true)
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return -1;
    }
}
