// package OOPS;
class Base {
    int x;

    public int getx() {
        return x;
    }

    public void setx(int X) {
        this.x = X;
    }

    public void printme() {
        System.out.println("I am const");
    }
}

class Derived extends Base {
    int Y;

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        this.Y = y;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // creating object for base class
        Base b = new Base();
        b.setx(4);
        System.out.println(b.getx());
        // creating object for derived class
        Derived d = new Derived();
        d.setY(8);
        System.out.println(d.getY());
    }

}
