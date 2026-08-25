import java.util.Arrays;

class CyclicSort {
    public static void main(String[] args) {
        int[] arr = { 3, 1, 2 };
        sort(arr, false);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, boolean hasZero) {
        int i = 0;

        while (i < arr.length) {
            int correctIdx = hasZero ? arr[i] : arr[i] - 1;

            if (arr[i] != arr[correctIdx]) {
                int tmp = arr[i];
                arr[i] = arr[correctIdx];
                arr[correctIdx] = tmp;
            } else
                i++;
        }
    }
}
