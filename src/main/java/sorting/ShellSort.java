package sorting;

public class ShellSort {

    public static void main(String[] args) {
        int[] a = {1, 3, 5, 7, 9, 2, 4, 6, 8, 0};
        sort(a);
        for (int j : a) {
            System.out.print(j + " ");
        }
    }

    public  static void sort(int[] a) {
        int n = a.length;
        int h = 1;
        while (h < n / 3) { // 3 is the optimal value for h
            h = 3 * h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < n; i++) {
                for (int j = i; j >= h && a[j] < a[j - h]; j -= h) {
                    int temp = a[j];
                    a[j] = a[j - h];
                    a[j - h] = temp;
                }
            }
            h = h / 3;
        }
    }
}
