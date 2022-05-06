import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Yeni Parolanızı Giriniz:");
        String yeniParola=input.nextLine();
        System.out.print("Onay Parolasını Giriniz:");
        String onay=input.nextLine();

        if(checkPsw(yeniParola,onay)){
            System.out.println("Parola Başarıyla Onaylandı");
        }
        else{
            System.err.println("Parola  Eşleşmedi...");

        }

    }
    public static boolean checkPsw(String password, String password1){
        return password.equals(password1);
    }



}
