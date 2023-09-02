// Write a Java program to calculate the average value of array elements.

import java.util.Scanner;

// import.java.util.*;

public class prog7 {
    public static void main(String[] args) {
        int avg = 0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] ary = new int[num];
        for (int i = 0; i < num; i++) {
            ary[i] = sc.nextInt();
        }
        for (int j = 0; j < num; j++) {
            avg += ary[j];
        }
        int Averge = avg / num;
        System.out.println("The averge is " + Averge);

    }

}
