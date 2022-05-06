import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("SAYI DEGERİ SINIFLARIMIZ");
        Scanner input=new Scanner(System.in);

        System.out.print("İlk değeri Giriniz:");
        int ilk=input.nextInt();
        System.out.print("Son değeri  Giriniz:");
        int son=input.nextInt();
        System.out.print("Sayi değeri  Giriniz:");
        int sayi=input.nextInt();

        System.out.println(sayiSorgula(ilk,son,sayi));
    }

    public static boolean sayiSorgula(int ilk,int son,int sayi){
        if(ilk>sayi||sayi<son){
            return true;
        }else {
            return false;
        }
    }
}
