import java.util.Arrays;
import java.util.Random;

public class Task_18 {
    public static void main(String[] args) {
        /*Task 18: Verilen aralıktaki sayılardan rastagele olarak verilen miktarda
        sayı üretip döndüren metodu yazınız.
                Method: int[] generateInteger(int start, int end,int quantity)*/

            System.out.println(Arrays.toString(generateInteger(0,500,10)));
        }
        public static int[] generateInteger(int start, int end,int quantity){
            int[]array=new int[quantity];
            Random crm=new Random();
            for (int i = 0; i <array.length ; i++) {
                int z=crm.nextInt(start,end);
                array[i]=z;
            }
            return array;
        }
    }
