public class Task_9 {
    public static void main(String[] args) {
    /*    Task 9: Verilen bir metindeki harf sayısını taban, kelime sayısını üs olarak
        belirleyiniz. Üs alma işlemini yapıp döndüren metodu yazınız.
                Method: int makePower(String text)*/
        String power="Ali at";
        System.out.println(makePower(power));

    }
    public static int makePower(String text){
            int harf=text.length();
            String[] power=text.split(" ");
            int kelime=power.length;

            return (int) Math.pow(harf,kelime);
        }

    }

