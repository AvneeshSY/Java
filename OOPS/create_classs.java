// package OOPS;

class Pen {
    String color;
    String type;

    public void write() {
        System.out.println();
    }

    public void wrt() {
        System.out.println(this.color);
    }
}

public class create_classs {
    public static void main(String[] args) {
        Pen pen1 = new Pen();
        pen1.color = "Blue";
        pen1.type = "gel";
        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.type = "gel";
        pen2.wrt();
        pen1.wrt();

    }

}
