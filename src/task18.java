public class task18 {
    public static void main(String[] args) {
      int start,end,miktar;
      generateInteger(14,85,10);
    }

    public static int generateInteger(int start, int end,int miktar){
    for (int i=0; i<miktar; i++) {
        System.out.print(start+(int) (Math.random() * end) + "\t");
    }return miktar;
    }

}
