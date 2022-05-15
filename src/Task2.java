import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Mod Alma İşlemi");
        Scanner input= new Scanner(System.in);
        System.out.print("İlk değeri Giriniz:");
        int ilk=input.nextInt();
        System.out.print("Son değeri  Giriniz:");
        int son=input.nextInt();
        int mod=0;
        System.out.printf("%d ile %d arasındaki 3 ye tam bölünen sayılar:\n",ilk,son);
        System.out.println(ucTamBol(ilk,son));
    }


    public static ArrayList<Integer> ucTamBol(int ilk, int son) {

        ArrayList<Integer>mod=new ArrayList<>();
        for(;ilk<son;ilk++){

            if(ilk%3==0){
                mod.add(ilk);
            }
        }return mod;
    }


}
