// package Sorting;
// Sorting of an array in java 

public class Bubble {
    public static void printArray(int num[]) {
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] num = { 3, 5, 2, 6, 8, 1, 4 };
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = 0; j < num.length - i - 1; j++) {
                if (num[j] > num[j + 1]) {
                    // swap
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }

            }
        }
        printArray(num);
    }
}
