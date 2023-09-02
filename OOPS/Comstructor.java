// package OOPS;

class myEmployee {
    private int id;
    private String name;

    // Constructor start
    public myEmployee() {
        id = 45;
        name = "Avnesh";
    }
    // end

    // parameter Constructor start
    public myEmployee(String myname) {
        id = 45;
        name = myname;
    }

    // end
    public String getName() {
        return name;
    }

    public void setname(String n) {
        this.name = n;

    }

    public int getid() {
        return id;
    }

    public void setid(int i) {
        this.id = i;
    }
}

public class Comstructor {
    public static void main(String[] args) {
        // myEmployee Avn = new myEmployee("Avneesh");
        myEmployee Avn = new myEmployee();
        System.out.println(Avn.getName());
    }

}
