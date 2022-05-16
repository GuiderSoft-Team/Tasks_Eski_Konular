import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Task_13 {
    public static void main(String[] args) {
      /*  Task 13: Verilen metin içerisindeki kelimelerin yerini rastgele değiştiren
        bir metot yazınız.
                Method: String shuffleWords(String text)*/

            String str = "Bildirimleri ve güncellemeleri almak için abone olun";
            System.out.println(shuffleWords(str));

        }

        public static String shuffleWords(String text) {
            String[] str = text.split(" ");
            ArrayList<String> list1 = new ArrayList<>(Arrays.asList(str));
            ArrayList<String> secilenler = new ArrayList<>();
            String str1 = "";
            Random rastgele = new Random();

            for (int i = 0; i < str.length; i++) {
                int secim = rastgele.nextInt(list1.size());
                secilenler.add(list1.get(secim));
                list1.remove(secim);

            }
            for (int i = 0; i < secilenler.size(); i++) {
                str1 += secilenler.get(i)+" ";
            }

            return str1;
        }
    }