import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 4, 5, 1 };
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void cycleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int correctIdx = arr[i] - 1;

            if (i != correctIdx) {
                int tmp = arr[i];
                arr[i] = arr[correctIdx];
                arr[correctIdx] = tmp;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            int correctIdx = arr[i] - 1;

            if (i != correctIdx) {
                int tmp = arr[i];
                arr[i] = arr[correctIdx];
                arr[correctIdx] = tmp;
            }
        }
    }

    static void ins(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int tmp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > tmp) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = tmp;
        }
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int max = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[max] > arr[j]) {
                    int tmp = arr[max];
                    arr[max] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
    }

    static void bubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}
