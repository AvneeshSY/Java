
// Factorial of the number 

public class prog3 {
    static int num(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        int fact_m = num(n - 1);
        int fact_n = n * fact_m;
        return fact_n;

    }

    public static void main(String[] args) {
        int n = 12;
        int result = num(n);
        System.out.println(result);
    }
}
