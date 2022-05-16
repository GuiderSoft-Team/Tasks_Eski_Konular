import java.util.ArrayList;

public class Task_6 {
    public static void main(String[] args) {
       /* Task 6: Verilen bir mantıksal dizide kaç tane doğru bulunduğunu döndüren
        metot yazınız.
        Method: int countTrueValues(boolean[] values)*/
        boolean[] deger = {false, true, true, false, true, true, false};
        System.out.println(countTrueValues(deger));
    }

    public static int countTrueValues(boolean[] values) {
        int count = 0;
        for (int i = 0; i < values.length; i++) {
            if (values[i]==true) {
                count++;
            }


        }return count;
    }
}