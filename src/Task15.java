public class Task15 {
    public static void main(String[] args) {

        int[] sayilar={2,3,4,6,7,8};

        System.out.println(takeSquare(sayilar));

    }
    public static String takeSquare(int[] values) {
        String sayi = "";
        String sayi1="";
        for (int i = 0; i < values.length; i++) {
            sayi = String.valueOf(values[i]*values[i]);
            sayi1=sayi;
            System.out.print(sayi1);
            System.out.print("-");
        }
       // System.out.printf("Dizinin Kareleri:"+","+sayi+"-");

    return sayi;
    }

}
