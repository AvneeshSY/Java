import java.util.Scanner;

public class twoD {
    public static void main(String[] args) {
        // Declaration
        // type[][] arrayName = new type [row][columns];
        // eg
        // int[][] number = new int[3][5];

        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] number = new int[rows][cols];
        // input
        // for rows
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                number[i][j] = sc.nextInt();
            }

        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(number[i][j] + " ");
            }
            System.out.println();
        }

    }

}
