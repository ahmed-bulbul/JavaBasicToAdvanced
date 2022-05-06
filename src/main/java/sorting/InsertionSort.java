package sorting;

public class InsertionSort {

    public static void main(String[] args) {
        int[] a = {3, 4, 2, 1, 5, 6, 7, 8};
        sort(a);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }

    public static void sort(int[] a) {
        for (int i = 1; i < a.length; i++) {
            int j = i;
            while (j > 0 && a[j] < a[j - 1]) {
                swap(a, j, j - 1);
                j--;
            }
        }
    }

    private static void swap(int[] a, int j, int i) {
        int temp = a[j];
        a[j] = a[i];
        a[i] = temp;
    }
}
