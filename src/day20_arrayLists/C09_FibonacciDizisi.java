package day20_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C09_FibonacciDizisi {
    public static void main(String[] args) {

        // Soru 4- Verilen pozitif bir n tamsayisini alarak,
        //         bize ilk n tane tane Fibonacci sayisini bir list olarak donduren bir method olusturun.

        // 0 1 1 2 3 5 8 13 21 34 55 89 ....

        System.out.println(istenenSayidaFibonacciSayisiListele(10));
        System.out.println(istenenSayidaFibonacciSayisiListele(15));
        System.out.println(istenenSayidaFibonacciSayisiListele(25));


    }

    public static List<Integer> istenenSayidaFibonacciSayisiListele(int sayiAdedi){

        List<Integer> fibonacciSerisi= new ArrayList<>();


        if(sayiAdedi<=0){
            System.out.println("yanlis giris");
        } else if (sayiAdedi==1) {
            fibonacciSerisi.add(0);
        } else if (sayiAdedi==2) {
            fibonacciSerisi.add(0);
            fibonacciSerisi.add(1);
        }else{
            int ilkSayi= 0;
            fibonacciSerisi.add(ilkSayi);
            int ikinciSayi= 1;
            fibonacciSerisi.add(ikinciSayi);
            int yenisayi = ilkSayi + ikinciSayi;
            fibonacciSerisi.add(yenisayi);

            while (fibonacciSerisi.size()<sayiAdedi){

                ilkSayi=ikinciSayi;
                ikinciSayi=yenisayi;
                yenisayi= ilkSayi+ikinciSayi;
                fibonacciSerisi.add(yenisayi);

            }
        }

        return fibonacciSerisi;
    }
}
