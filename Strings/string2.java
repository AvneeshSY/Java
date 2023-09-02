// package Strings;

public class string2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Avneesh");
        System.out.println(sb);
        // char at index 0
        System.out.println(sb.charAt(0));
        // set char at index 0
        sb.setCharAt(0, 'p');
        System.out.println(sb);
        // insertchar
        sb.insert(3, 'e');
        System.out.println(sb);
        // delelte extra 'e'
        sb.delete(3, 4);
        System.out.println(sb);

        // Append
        StringBuilder av = new StringBuilder("h");
        av.append("e");
        av.append("l");
        av.append("l");
        av.append("o");
        System.out.println(av);

    }

}
