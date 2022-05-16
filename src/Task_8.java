import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.jar.JarFile;

public class Task_8 {
    public static void main(String[] args) {
     /*   Task 8: Verilen bir metni karakter dizisine çeviren metot yazınız.
        Method: char[] convertStringToChars(String text)*/
        String kelime="BUGÜN HAVA GÜZEL!";
        System.out.println(convertStringToChars(kelime));

    }
    public static ArrayList<Character>convertStringToChars(String text){
        ArrayList<Character> harf=new ArrayList<>();
        for (int i = 0; i < text.length(); i++) {
                harf.add(text.charAt(i));

        }
        return harf;
    }
}
