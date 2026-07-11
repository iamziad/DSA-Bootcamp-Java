// Mountain Array

class BitonicArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 3, 2, 1};
        int[] arr2 = {2, 4, 5, 6, 7, 2, 1};
        int[] arr3 = {23, 30, 55, 120, 40, 52, 1};

        System.out.println(bitonicArray(arr1));
        System.out.println(bitonicArray(arr2));
        System.out.println(bitonicArray(arr3));
    }

    static int bitonicArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while(start < end) {
            int mid = Math.addExact(start, end) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}
