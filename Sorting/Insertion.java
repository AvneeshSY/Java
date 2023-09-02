// package Sorting;

public class Insertion {
    public static void main(String[] args) {

        int[] a = { 5, 2, 6, 1, 8 };
        for (int i = 1; i < a.length; i++) {
            int j = i;
            int temp = a[i];
            while (j > 0 && a[j - 1] > temp) {

                a[j] = a[j - 1];
                // a[j - 1] = temp;
                // a[j - 1] = temp;
                j = j - 1;

            }
            a[j] = temp;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

}
