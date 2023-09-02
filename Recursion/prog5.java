// package Recursion;
// print reverse an string 
public class prog5 {
    static void Rec(String str, int idx) {
        if (idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.println(str.charAt(idx));
        Rec(str, idx - 1);
    }

    public static void main(String[] args) {
        String str = "abcd";
        Rec(str, str.length() - 1);
    }
}
