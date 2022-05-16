public class Task_11 {
    public static void main(String[] args) {
  /*      Task 11: Verilen satır ve sütun adedince yıldız (*) çizen iki metot tasarlayınız.
        Method 1: void drawStar(int row, int column)
        Örn;
 * * * * *
*          *
*          *
*          *
* * * * *
        Method 2: void fillStar(int row, int column)
        Örn;
* * * * *
* * * * *
* * * * *
* * * * *
*/
        //Method 2
        drawStar(5,4);
    }
    public static void drawStar(int row, int column){
        for (int i = 0; i <column; i++) {
            for (int j = 0; j <row; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }

    }
}
