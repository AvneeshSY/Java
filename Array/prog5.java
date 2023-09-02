//  Write a Java program to sum values of an array.
public class prog5 {
    public static void main(String[] args) {
        int[] num = { 10, 20, 30, 40 };
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i];

        }
        System.out.println(sum);

    }

}
