
// Write a Java program to insert an element (specific position) into an array.
import java.util.Arrays;

public class prog10 {
    public static void main(String[] args) {
        int[] my_array = { 25, 14, 56, 15, 36, 56, 77, 18, 29, 49 };
        int ind_pos = 2;
        int newvalue = 5;
        System.out.println(Arrays.toString(my_array));
        for (int i = my_array.length - 1; i > ind_pos; i--) {
            my_array[i] = my_array[i - 1];
        }
        my_array[ind_pos] = newvalue;
        System.out.println(Arrays.toString(my_array));
    }

}
