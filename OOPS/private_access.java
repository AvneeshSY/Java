class Employee {
    int id;
    String name;

    public String getname() {
        return name;
    }

    public void setname(String n) {
        name = n;
    }

    public void setid(int i) {
        id = i;
    }

    public int getid() {
        return id;
    }
}

public class private_access {
    public static void main(String[] args) {
        Employee Avneesh = new Employee();
        Avneesh.setname("RAJ");
        Avneesh.setid(10);
        System.out.println(Avneesh.getname());
        System.out.println(Avneesh.getid());

    }

}