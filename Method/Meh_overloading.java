public class Meh_overloading {

    // With method overloading, multiple methods can have the same name with
    // different parameters:55666656663365699
    static int fun(int a, int b) {
        int c;
        if (a > b) {
            c = a * b;
        } else {
            c = a + b;
        }
        return c;
    }

    static int fun(int a, int b, int e) {
        int c;
        if (a > b) {
            c = a * b * e;
        } else {
            c = a + b;
        }
        return c;
    }

    public static void main(String[] args) {
        int z = fun(5, 3);
        System.out.println(z);
        int y = fun(5, 3, 5);
        System.out.println(y);
    }

}
