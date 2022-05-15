import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

convertStringToChars("iyi günler");
    }
    public static char[] convertStringToChars(String text){

        String metin = text;
        String dizi[]=new String[metin.length()];
        for(int i=0;i<metin.length();i++){
            String harf=metin.substring(i, i+1);
            dizi[i]=harf;
        }

        for(int a=0;a<metin.length();a++){
            System.out.println("dizi["+a+"]="+dizi[a]);
        }
        return new char[0];
    }
}
