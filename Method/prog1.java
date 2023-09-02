// package Method;

public class prog1 {
    static int add(int x, int y) {
        int z;
        if (x > y) {
            z = x + y;
        } else {
            z = x - y;
        }
        return z;
    }

    public static void main(String[] args) {
        // calling MEthod
        int sum = add(8, 5);
        System.out.println(sum);
    }

}
