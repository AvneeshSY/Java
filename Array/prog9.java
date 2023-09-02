
// Reverse an Array in java
import java.util.Arrays;

public class prog9 {
    public static void main(String[] args) {
        int[] num = { 20, 50, 30, 40, 50 };
        int i = 0, j = num.length - 1, temp;
        while (i < j) {
            temp = num[i];
            num[i] = num[j];
            num[j] = temp;
            i++;
            j--;

        }
        System.out.println(Arrays.toString(num));
    }

}
