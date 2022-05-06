public class Task17 {
    public static void main(String[] args) {

        System.out.println(generateInteger(100));

    }
    public static int generateInteger(int quantity){
        for (int i=0; i<20; i++) {
            int a = ((int) (Math.random() * 100));
            System.out.print(a + "\t");
        }return quantity;
    }
}
