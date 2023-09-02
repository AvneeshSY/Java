import java.util.Scanner;

public class prog3 {
    static void test(int num) {
        if (num % 2 == 0) {
            System.out.println("NUmber is Even");
        } else {
            System.out.println("Number is odd");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        test(num);

    }

}
