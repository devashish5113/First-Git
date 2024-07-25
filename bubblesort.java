public class bubblesort {
    public static void main(String[] args) {
        int arr[] = { 15, 16, 6, 8, 5 };
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("array after bubble sort is ");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }

}
