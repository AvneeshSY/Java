import java.util.Scanner;
// package Strings;

public class strings1 {

    public static void main(String[] args) {
        // Strings are used for storing text.

        // A String variable contains a collection of characters surrounded by double
        // quotes:
        // String greeting = "Hello";
        // ---String Length----
        // A String in Java is actually an object, which contain methods that can
        // perform certain operations on strings. For example, the length of a string
        // can be found with the length() method:
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name.length());
        for (int i = 0; i < name.length(); i++) {
            System.out.println(name.charAt(i));
            // charAt is used to print character one by one.

        }
        // Camparision to string
        // s1>s2:+ve value
        // s1==s2: 0
        // s1<s2:-ve value
        String fname = "Avneesh";
        String last = "Avneesh";
        if (fname.compareTo(last) == 0) {
            System.out.println("String are equal");
        } else {
            System.out.println("not equal");
        }
        String sentence = "My name is Avneesh";
        String Lname = sentence.substring(11, sentence.length());
        System.out.println(Lname);
    }

}
