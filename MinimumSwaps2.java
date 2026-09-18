public class MinimumSwaps2 {
    static int minimumSwaps(int[] arr) {
        int res = 0;
        int idx = 0;
        while (idx < arr.length) {

            if (idx != arr[idx] - 1) {
                swap(arr, idx, arr[idx] - 1);
                res += 1;
            } else {
                idx += 1;
            }
        }
        return res;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
