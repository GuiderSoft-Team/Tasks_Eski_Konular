import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {


        sayiSorgula(5);
        sayiSorgula(114);
    }




    public static int sayiSorgula(int sayi) {


        if (0 < sayi && sayi < 100) {
            System.out.println("Girilen Sayi İstenilen Aralıkta");
        } else {
            System.out.println("Girilen Sayi İstenilen Aralıkta Değil");
        }

        return sayi;
    }
}
