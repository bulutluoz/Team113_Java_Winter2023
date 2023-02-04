package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C04_IfStatements {

    public static void main(String[] args) {

        // Soru 5- Kullanicidan notunu alin
        //         50 veya daha buyukse ”Sinifi Gectin”,
        //         50’den kucukse “Maalesef kaldin” yazdirin.

        /*
            if statements'da sart parantezinden sonra {} kullanmazsak
            Java ilk ; ' e kadar olan kismi if body olarak kabul eder

            if body zaten bir satir ise bu bir sorun olmaz
            ama if body 1 satirdan coksa, ilk satirdan sonrasi
            her durumda calisir
         */


        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen notunuzu giriniz");

        double not = scan.nextDouble();

        if(not >= 50 && not<=100) System.out.println("Sinifi gectin");

            System.out.println("Kontrol1");
            System.out.println("Kontrol2");
            System.out.println("Kontrol3");



        if (not<50) System.out.println("Maalesef kaldin");


    }
}
