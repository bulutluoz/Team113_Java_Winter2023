package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C03_IfStatements {
    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        //        ucgen eskenar ise “Eskenar ucgen” yazdirin.


        Scanner scan = new Scanner(System.in);

        System.out.println("Ucgenin 3 kenar uzunlugunu giriniz");

        double kenar1 = scan.nextDouble();
        double kenar2 = scan.nextDouble();
        double kenar3 = scan.nextDouble();

        /*
            Java'da 3'lu karsilastirma YOKTUR
            Onun yerine ikili karsilastirmalar yapip && ile birlestirebiliriz

         */

        if (kenar1 == kenar2 && kenar1 == kenar3 && kenar1>0){
            System.out.println("Girilen kenarlar bir eskenar ucgen olusturur");

        }
    }
}
