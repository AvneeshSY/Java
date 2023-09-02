// package OOPS;

class test {
    int id;
    String name;

    public void demo() {
        System.out.println("The name is :" + name);
        System.out.println("The id is :" + id);
    }

}

public class create_class {

    public static void main(String[] args) {
        test Av = new test();
        Av.name = "Avneesh";
        Av.id = 10;
        // System.out.println(Av.name);
        Av.demo();

    }

}
