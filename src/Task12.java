import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz:");
        int deger = input.nextInt();

        System.out.print(signumFunc(deger));
    }

    public static int signumFunc(int deger) {
        if (deger < 0) {
            System.out.println("-1");
        }
        if (deger == 0) {
            System.out.println("0");

        } else {
            System.out.println("+1");

        }return deger;
    }

}