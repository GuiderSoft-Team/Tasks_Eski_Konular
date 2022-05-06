public class Taks7 {

    public static void main(String[] args) {
        char[] metin={'H','A','Y','I','R','L','I',',', 'A','K','S','A','M','L','A','R'};

        System.out.println("Birleşen metin:"+makeText(metin));
        }
    public static String makeText(char[] values){
        String metin="";
        for (int i = 0; i < values.length; i++) {
            metin+=values[i];

        } return metin;
    }
}

