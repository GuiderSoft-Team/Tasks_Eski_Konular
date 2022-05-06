import static java.util.Collections.reverse;

public class Task14 {
    public static void main(String[] args) {

        System.out.print(reverseCharsOfEachWords("HAYIRLI GÜNLER"));
    }
    public static String reverseCharsOfEachWords(String text){

        String metin="";

            for (int i = text.length() - 1; i >= 0; i--) {
                metin += text.charAt(i);

            }
            return metin;
    }
}
