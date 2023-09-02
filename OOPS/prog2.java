// package OOPS;

class square {
    int side;

    int sq() {
        return side * side;
    }

    int para() {
        return 4 * side;
    }
}

public class prog2 {
    public static void main(String[] args) {
        square num = new square();
        num.side = 5;
        System.out.println(num.sq());
        System.out.println(num.para());
    }

}
