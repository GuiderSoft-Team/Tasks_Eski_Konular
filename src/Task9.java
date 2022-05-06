public class Task9 {
    public static void main(String[] args) {

makePower("selam dünya hali yalan");



    }
    public static double makePower(String text){
        double harS=text.length();
        double sonuc = 0;
        System.out.println("Harf Sayısı="+text.length());

        double sayac=0;
        for (int i = 0; i < text.length(); i++) {
            if(text.charAt(i)==' ')sayac++;

        }
        System.out.println("Kelime Sayısı="+(sayac+1));

        System.out.println("Üs Alma İşlem Sonucu:"+Math.pow(harS,sayac));

return sonuc;
    }

}
