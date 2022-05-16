import java.util.Scanner;

public class Task_1 {
   /* Task 1: Klavyeden girilen taban (int) ve üs (int) değerlerinin işlem sonucunu
            (üs alma işlemi) ekrana yazdıran Java programını yazınız. (Örn; 2^3=8 gibi.)*/
   public static void main(String[] args) {

       Scanner input=new Scanner(System.in);
       System.out.print("Taban Değeri Giriniz : ");
       int taban= input.nextInt();
       System.out.print("Us Değer Giriniz : ");
       int us= input.nextInt();

       int sonuc= (int) Math.pow(taban,us);
       System.out.print("Sonuc : " + sonuc);
   }


}
