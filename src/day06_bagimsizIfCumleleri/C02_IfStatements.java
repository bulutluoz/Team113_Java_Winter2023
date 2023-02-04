package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C02_IfStatements {
    public static void main(String[] args) {

        // Soru 1- Kullanicidan bir sayi isteyin,
        //         sayiyi kontrol edip 5 ile bolunebiliyorsa “Sayi 5’in tam kati” yazdirin.

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen pozitif bir tamsayi giriniz");

        int sayi = scan.nextInt();

        if (sayi % 5 == 0){
            System.out.println("Sayi 5’in tam kati");
        }

        //Soru 3- Kullanicidan bir sayi alin,
        //         sayi 3 ile bolunuyorsa ”Uc ile bolunebilen sayi”,
        //         5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.


        if (sayi % 3 == 0){
            System.out.println("Uc ile bolunebilen sayi");
        }
    }
}
