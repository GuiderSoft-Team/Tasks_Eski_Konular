import java.util.ArrayList;
import java.util.Arrays;

public class Task_3 {
    public static void main(String[] args) {
       /* Task 3: Verilen iki değer arasındaki tam sayıların ikiye tam bölünenlerini
                (çift sayıları) tamsayı dizisi (int[]) olarak geri döndüren metodu yazınız.
        Method: int[] getEvenNumbers(int start, int end)*/


        System.out.println(getEvenNumbers(5,16));

    }

    public static ArrayList<Integer> getEvenNumbers(int start, int end) {
        ArrayList<Integer> array=new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                array.add(i);
            }

        }
return array;
    }
}