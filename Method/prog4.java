public class prog4 {
    // write main method that displays prime numbers
    static void testprime(int no) {
        int temp = 0;
        for (int i = 2; i <= no - 1; i++) {
            if (no % i == 0) {
                temp = temp + 1;
            }
        }
        if (temp == 0) {
            System.out.println("The number is prime");

        } else {
            System.out.println("number is not prime");
        }
    }

    public static void main(String[] args) {
        testprime(4);
    }

}
