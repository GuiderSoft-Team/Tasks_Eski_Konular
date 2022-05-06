


import java.util.ArrayList;
        import java.util.Scanner;
public class Task3 {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        System.out.print("İlk değeri giriniz: ");
        int start = tara.nextInt();
        System.out.print("Son değeri giriniz: ");
        int end = tara.nextInt();
        System.out.printf("%d ile %d arasındaki 2 ye tam bölünen sayılar:\n",start,end);
        System.out.println(getEvenNumbers(start,end));

    }
    public static ArrayList<Integer> getEvenNumbers(int start,int end)
    //donus tipini arraylist tanimladim ki, bulunan degerleri arrayliste dogrudan ekle diyebilelim
    {
        ArrayList<Integer>numbers=new ArrayList<>();
        for (;start<end;start++) {
            // baslangic degeri tanimlamamiza gerek yok, starti 1er artiririz. start endden kucuk olmali

            if (start%2==0)
            {
                numbers.add(start);
            }
        }
        return numbers;
    }

}
//    donus tipi array olursa boyutunu yazmamiz falan gerek ugrasitirir. onun yerine arraylist tanimliyorum ki bulunan degeri dogrudan ekleybiliriz. add metodu ile.
  //      anlasilmiyorsa tekrar bakabiliriiz. biz ara verdigimiz de