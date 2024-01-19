public class Sort {
    public static void main(String[] args) {
        int[] arr = {3, 5, 2, 6, 1, 4};
        Sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void Sort(int[] arr) {
        int n = arr.length;
        boolean tmp;
        for (int i = 0; i < n - 1; i++) {
            tmp = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    tmp = true;
                }
            }
            if (!tmp) {
                break;
            }
        }
    }
}
