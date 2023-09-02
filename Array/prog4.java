
// Write a Java program to sort a numeric array and a string array.
import java.util.Arrays;

public class prog4 {
    public static void main(String[] args) {
        int[] num = { 10, 50, 30, 40, 20 };
        String[] name = { "Avneesh", "Vijay", "Kumesh", "Aniket" };
        // print num
        System.out.println(Arrays.toString(num));
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        // print string
        System.out.println(Arrays.toString(name));
        Arrays.sort(name);
        System.out.println(Arrays.toString(name));
    }

}
