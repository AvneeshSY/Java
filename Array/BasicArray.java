public class BasicArray {
    public static void main(String[] args) {
        // Arrays are used to store multiple values in a single variable, instead of
        // declaring separate variables for each value.
        // To declare an array, define the variable type with square brackets:
        // eg
        // type[] arrayname = new type[size];
        // arrayname[0]=value
        // String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] num = { 10, 20, 30, 40, 50 };
        System.out.println(num[1]);
        for (int i = 0; i < 5; i++) {
            System.out.println(num[i]);
        }
    }

}
