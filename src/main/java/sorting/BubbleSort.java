package sorting;

public class BubbleSort {

    public static void main(String[] args) {
        int[] a = {3, 1, 5, 2, 4};
        sort(a);
        for (int j : a) {
            System.out.print(j + " ");
        }
    }

    public static void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }
}
