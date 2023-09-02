// package Method;

public class Methods {

    static void myMethod() {
        System.out.println("I just got executed!");
    }

    public static void main(String[] args) {
        myMethod();
    }
    // A method is a block of code which only runs when it is called.
    // You can pass data, known as parameters, into a method.
    // Methods are used to perform certain actions, and they are also known as
    // functions.
    // Why use methods? To reuse code: define the code once, and use it many times.

    /*
     * Create a method inside Main:
     * public class Main {
     * static void myMethod() {
     * // code to be executed
     * }
     */
    /*
     * Example Explained
     * myMethod() is the name of the method
     * static means that the method belongs to the Main class and not an object of
     * the Main class. You will learn more about objects and how to access methods
     * through objects later in this tutorial.
     * void means that this method does not have a return value.
     */
}
