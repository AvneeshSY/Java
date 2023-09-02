// package OOPS;

class ring {
    public void ringg() {
        System.out.println("Ringing");
    }

    public void vibrate() {
        System.out.println("vibrating");
    }

}

public class prog1 {
    public static void main(String[] args) {
        ring prt = new ring();
        prt.ringg();
        prt.vibrate();
    }

}
