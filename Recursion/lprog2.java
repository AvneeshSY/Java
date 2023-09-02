// package Recursion;
// print sum of n natural number

public class lprog2 {
    static void prrintsum(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
            return;
        }
        sum += i;
        prrintsum(i + 1, n, sum);
    }

    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        int n = 5;
        prrintsum(i, n, sum);
    }

}
