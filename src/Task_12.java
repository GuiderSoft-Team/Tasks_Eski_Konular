public class Task_12 {
    public static void main(String[] args) {
/*        Task 12: Verilen sayı negatif ise -1, pozitif ise 1 ve sıfır ise 0 döndüren
        metodu yazınız.
        Method: int signumFunc(int value)*/

        System.out.println(signumFunc(-7));
    }
    public static int signumFunc(int value){
        return Integer.compare(value, 0);
    }
}