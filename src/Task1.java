import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //task 1
        Scanner input= new Scanner(System.in);
        System.out.print("Taban Rakamı Giriniz:");
        int taban=input.nextInt();
        System.out.print("Üst Rakamı Giriniz:");
        int us=input.nextInt();

        int ustAlmaİslemi=1;
        for (int i = 1; i <=us ; i++) {

            ustAlmaİslemi=ustAlmaİslemi*taban;

        }
        System.out.printf("%s in %s kuvvetinin değeri: %s",taban,us,ustAlmaİslemi);
    }
}
