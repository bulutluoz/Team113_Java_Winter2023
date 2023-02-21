package day14_methodOverloading_whileLoop;

import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {
        /// Kullanicidan toplanmak uzere sayilar alin
        // toplam 500 olursa veya 500'u gecerse
        // kac sayi girdigini ve sayilarin toplamini yazdirin

        Scanner scan = new Scanner(System.in);


        int girilenSayi=0;
        int toplam=0;
        int girilensayiadedi=0;


        while (toplam<500){ // toplam 500'den kucuk oldugu sure boyunca
            System.out.println("Toplanmak uzere bir tamsayi giriniz");

            girilenSayi= scan.nextInt();

            toplam += girilenSayi;
            girilensayiadedi++;
        }

        System.out.println("Toplam " + girilensayiadedi + " adet sayi girildi ve toplami : " + toplam);





    }
}
