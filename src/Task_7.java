public class Task_7 {
    public static void main(String[] args) {
      /*  Task 7: Verilen bir karakter dizisini metin olarak döndüren metot yazınız.
                Method: String makeText(char[] values)*/
                char[] harf={'M','İ','L','A','T'};
        System.out.println(makeText(harf));

    }
    public static String makeText(char[] values){
        String kelime=" ";
        for (int i = 0; i < values.length; i++) {
            kelime+=values[i];
        }
        return kelime;
    }
}
