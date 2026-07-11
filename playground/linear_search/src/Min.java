public class Min {
    public static void main(String[] args) {
        int[] arr = {32, 4, -2, -34, 53, 0};
        System.out.println(findMin(arr));
    }
    static int findMin(int[] arr) {
        if (arr.length == 0)
            return -1;

        int min = arr[0];
        for (int i = 1; i < arr.length; i++)
            if (min > arr[i])
                min = arr[i];

        return min;
    }
}
