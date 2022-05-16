import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
/*
        Task 2: Klavyeden girilen iki değer arasındaki tüm sayılardan sadece üçe tam
        bölünenleri tespit edip ekrana yazdıran Java programını yazınız.
*/
        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı Girin : ");
        int ilk = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz : ");
        int son = input.nextInt();

        for (int i = ilk; i <= son; i++) {
            if (i % 3 == 0) {
                int sonuc = i;
                System.out.print(sonuc+",");
            }
        }

    }
}
