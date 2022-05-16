public class Task_4 {
    public static void main(String[] args) {
        /*Task 4: Verilen bir sayının belirli bir aralıkta olup olmadığını sorgulayan
        metot yazınız.
        Method: boolean isNumberBetweenFiftyAndHundred(int number)*/

        System.out.println(isNumberBetweenFiftyAndHundred(10));

    }

    public static boolean isNumberBetweenFiftyAndHundred(int number) {
        return (number > 0 && number < 100);
        }
    }
