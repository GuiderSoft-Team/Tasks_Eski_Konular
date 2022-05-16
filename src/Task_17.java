import java.util.Arrays;
import java.util.Random;

public class Task_17 {
    public static void main(String[] args) {
      /*  Task 17: 0-100 arasındaki sayılardan rastagele olarak verilen miktarda
        sayı üretip döndüren metodu yazınız.
                Method: int[] generateInteger(int quantity)*/
        System.out.println(Arrays.toString(generateInteger(6)));
    }
    public static int[] generateInteger(int quantity){
        Random crm=new Random();
        int[]array=new int[quantity];

        for (int i = 0; i <quantity ; i++) {
            int z=crm.nextInt(100);
            array[i]=z;
        }
        return array;
    }
}

