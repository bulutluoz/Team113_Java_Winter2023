package day04_dataCasting_wrapperClasses;

public class C01_AsciiTable {

    public static void main(String[] args) {

        /*

        24 ==> 11000
         a ==> 97 ==> 10100010
         b ==> 98

         ahmet
         */

        // char data turundeki variable ve degerler
        // sayisal data turlerine atanirsa veya
        // sayisal data turundeki datalarla isleme sokulursa
        // ASCII table'daki degerleri ile isleme girer

        System.out.println(5 + 'a'); // 5 + 97 = 102

        char ilkHarf= 101;

        System.out.println(ilkHarf); // e

        // kullanicinin verdigi harften bir sonraki harfi yazdirin

        char girilenChar= 'f';

        System.out.println(girilenChar+1); // 102 + 1 = 103
        // biz 103'u degil, 103'un karsiligi olan char ifadeyi yazdirmak istersek explicit casting yapariz

        System.out.println("Girilen harfin bir sonrasi : "+(char) (girilenChar+1));

        // verilen bir harften 2 onceki harfi yazdirin

        girilenChar='M';

        System.out.println(girilenChar-2); // 77 - 2= 75

        System.out.println((char)(girilenChar-2)); // K
    }
}
