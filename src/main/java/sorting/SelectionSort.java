package sorting;

public class SelectionSort {

    public static void main(String[] args) {
        int[] a = {3, 2, 1, 4, 5, 6};
        sort(a);
        for (int j : a) {
            System.out.print(j+" ");
        }
    }


    public static void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int min = i; // set first element as minimum
            for (int j = i + 1; j < a.length; j++) {
                //if next element is smaller than current minimum, set it as minimum
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            //after finding minimum, swap it with current element
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
    }
}
