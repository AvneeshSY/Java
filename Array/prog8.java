// Find the max and min number in an Array
public class prog8 {
    public static void main(String[] args) {
        int[] num = { 10, 20, 60, 49, 30 };
        int max = num[0];
        int min = num[0];
        for (int i = 1; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
            }

        }
        System.out.println(max);
        for (int i = 1; i < num.length; i++) {
            if (min > num[i]) {
                min = num[i];
            }

        }
        System.out.println(min);

    }

}
