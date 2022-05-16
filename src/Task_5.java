public class Task_5 {
    public static void main(String[] args) {
     /*   Task 5: Verilen sayının aralık dışında olup olmadığını sorgulayan metot yazınız.
                Method: boolean isNumberOutOfRangeFiftyAndHundred(int number)*/
        System.out.println(isNumberOutOfRangeFiftyAndHundred(20));

    }
    public static boolean isNumberOutOfRangeFiftyAndHundred(int number){
        return number<1||100<number;
    }
}
