import java.util.Arrays;

class InsersionSort {
    public static void main(String[] args) {
        int[] arr = { 60, 20, 50, 30, 10, 40 };
        inserstionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void inserstionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i]; // current element in the unsorted side;
            int j = i - 1; // last element in the sorted side (the border between sorted and unsorted sides)

            // compare the tmp with all elements in the sorted side
            while (j >= 0 && arr[j] > tmp) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = tmp;
        }
    }
}
