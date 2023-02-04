package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {

        /*  Eger bir olay icin
            Sadece 2 olasilik varsa
            Ve bu olasiliklardan birisi mutlaka calisacaksa
            If Else Statements kullaniriz

            If-else statement'da if bodys'si veya else body'si mutlaka calisir
            ikisinin birden calisma ihtimali YOKTUR
            ikisinin de calismama ihtimali YOKTUR

         */

        // Soru 5- Kullanicidan notunu alin
        //         50 veya daha buyukse ”Sinifi Gectin”,
        //         50’den kucukse “Maalesef kaldin” yazdirin.

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen notunuzu giriniz");

        double not = scan.nextDouble();

        if(not >= 50 && not<=100) {
            System.out.println("Sinifi gectin");
        }

        else {
            System.out.println("Maalesef kaldin");
        }


        // Kullanicidan pozitif bir tamsayi alin
        // sayinin tek veya cift sayi oldugunu yazdirin

        System.out.println("pozitif bir tam sayi giriniz");
        int sayi = scan.nextInt();

        if (sayi % 2 == 0){
            System.out.println("Girilen sayi cift sayi");
        } else {
            System.out.println("Girilen sayi tek");
        }

        // Kullanicidan pozitif bir tamsayi alin
        // 5 ile bolunup bolunmedigini yazdirin

        if (sayi % 5 == 0){
            System.out.println("sayi 5 ile tam olarak bolunebilir");
        }else {
            System.out.println("sayi 5 ile tam olarak bolunemez");
        }
    }
}
