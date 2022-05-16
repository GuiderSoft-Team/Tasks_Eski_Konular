import java.util.Arrays;

public class Task_14 {
    public static void main(String[] args) {
       /* Task 14: Verilen metin içerisindeki kelimelerin yerini değiştirmeden,
        her bir kelimenin harflerini ters çevirip tam bir metin olarak
        döndüren metodu yazınız.
                Method: String reverseCharsOfEachWords(String text)
*/
        String str="Bir berber bir berbere gel beraber bir berber dükkanı açalım demiş.";
        System.out.println(reverseCharsOfEachWords(str));
    }
    public static String reverseCharsOfEachWords(String text){

        String crm="";
        for (int i = text.length()-1; i>=0 ; i--) {
            crm+=text.charAt(i);
        }
        String[]strArray=crm.split(" ");
        String str2="";
        for (int i = strArray.length-1 ;i>=0 ; i--) {
            str2+=strArray[i]+" ";
        }
        return str2;
    }
}
