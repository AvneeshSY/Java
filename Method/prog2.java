// package Method;

import java.util.Scanner;

// method.java.util.Scanner;

public class prog2 {
    static int mult(int x, int y) {
        int z;
        if (x > y) {
            z = x * y;
        } else {
            z = x + y;
        }
        return z;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking input
        System.out.println("Enter the value of a:");
        int a = sc.nextInt();
        System.out.println("Enter the value of b:");
        int b = sc.nextInt();
        // Method call
        int result = mult(a, b);
        // print
        System.out.println("The result of the input is :" + result);
    }

}
