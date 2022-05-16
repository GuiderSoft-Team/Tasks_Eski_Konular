import java.util.Random;

public class Task_16 {
    public static void main(String[] args) {
       /* Task 16: Verilen uzunlukta rastgele parola oluşturan metodu yazınız.
                Sadece A..Z ve a..z arasındaki karakterler kullanılacaktır.
        Method: String generatePassword(int length)*/
        System.out.println(generatePassword(6));
    }
    public static String generatePassword(int length){
        String str="";
        Random pass=new Random();
        for (int i = 0; i <length ; i++) {
            int a= pass.nextInt(65,122);
            str+=Character.toString(a);

        }

        return str;
    }
}
