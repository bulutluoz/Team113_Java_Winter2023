package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C11_SwitchStatements {
    public static void main(String[] args) {

        // Kullanicidan bir harf isteyin
        // o harfle baslayan gun ismi varsa yazdirin
        // yoksa "gecersiz harf" yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char harf= scan.next().charAt(0);

        harf = Character.toUpperCase(harf);

        if (harf=='P'){
            System.out.println("Pazar, Pazartesi veya Persembe");
        } else if (harf == 'S') {
            System.out.println("Sali");
        } else if (harf == 'C') {
            System.out.println("Carsamba, Cuma veya Cumartesi");
        } else {
            System.out.println("Gecersiz harf");
        }

        System.out.println("======================");
        // daha duzenli ve kullanisli olarak switch statement kullanabiliriz
        // switch statements , switch'in onunde yazilan degiskene esit olan case'i calistirir
        // calismaya basladiktan sonra
        // break gorunceye kadar veya switch'in sonuna kadar calisir

        switch (harf) {

            case 'S' :
                System.out.println("Sali");
                break;

            case 'P' :
                System.out.println("Pazar, Pazartesi veya Persembe");
                break;

            case 'C' :
                System.out.println("Carsamba, Cuma veya Cumartesi");
                break;

            default:
                System.out.println("Gecersiz harf");
        }
    }
}
