import java.util.Scanner;
 /*      Task 11: Verilen satır ve sütun adedince yıldız (*) çizen iki metot tasarlayınız.
        Method 1: void drawStar(int row, int column)
        Örn;
 * * * * *
*          *
*          *
*          *
* * * * * *              */
public class Task_11_b {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Dikdörtgen Ölçüleri");
        System.out.print("kenar1:");
        int row = input.nextInt();
        System.out.print("kenar2:");
        int col = input.nextInt();
        drawStar(row, col);
        System.out.println();
        fillStar(row, col);
    }

    private static void fillStar(int row, int col) {
    }

    public static void drawStar(int row, int column) {
        String[][] str = new String[row][column];

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                if (i == 0 || i == str.length - 1) {
                    str[i][j] = " * ";
                } else if (j == 0 || j == str[i].length - 1) {
                    str[i][j] = " * ";
                } else {
                    str[i][j] = "   ";
                }
            }
        }
        for (String[] row1 : str) {
            for (String col1 : row1) {
                System.out.print(col1 + " ");
            }
            System.out.println();
        }

    }
}