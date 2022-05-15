public class Task11 {
    public static void main(String[] args) {

       System.out.print(drawStar(5,5));
        System.out.println();
        System.out.println();
        System.out.println(kareCiz(1,5));
    }

    public static int kareCiz(int satir,int sutun){
        for (int i = 0; i < 5; i++) {
            System.out.print("*\t");
        }
        for (int i = 0; i < 3; i++) {
             System.out.print("\n");
            System.out.print("*\t\t\t\t*\n");


        }


        for (int i = 0; i < 5; i++) {
            System.out.print("*\t");

        }

        return 0;
    }


    public static int drawStar(int row, int column) {
       int sayac=0;
        for (int i = 0; i < 5; i++) {
            System.out.println("\n");
            for (int j = 0; j < 5; j++) {
                System.out.print("*\t");
                sayac++;
                if(sayac==column){
                    break;
                }
            }sayac++;
            if(sayac==row){
                break;
            }

        }return 0;
    }


}
