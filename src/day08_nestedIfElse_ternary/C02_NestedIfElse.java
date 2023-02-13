package day08_nestedIfElse_ternary;

import java.util.Scanner;

public class C02_NestedIfElse {
    public static void main(String[] args) {
        /*
        Kullanicidan cinsiyetini ve yasini alin,
        Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        veya “Emekli olmak icin .. yil daha calisman gerekir” yazdirin.
        hatali giris yapilirsa kullaniciyi uyarin
         */

        // birden fazla degiskene bagli if else statement'larini yazarken
        // once degiskenlerden birine gore ana yapiyi olusturalim
        // bu soruda cinsiyeti ana degisken yapalim

        // ikinci degiskeni ana degiskenin her bolumunde ayri ayri degerlendirelim

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen yasinizi giriniz");

        double yas = scan.nextDouble();

        System.out.println("Lutfen cinsiyetinizi giriniz..." +
                "\nKadin icin : K, Erkek icin : E giriniz");

        char cinsiyet = scan. next().charAt(0);

        if (cinsiyet=='k' || cinsiyet=='K'){ // Kadin

            if (yas<16 || yas>80){
                System.out.println("Gecersiz yas girisi, lutfen tekrar deneyin");
            } else if (yas<60) {
                System.out.println("Emekli olmak icin daha " + (60-yas) + " yil daha calismalisin");
            }else{
                System.out.println("Emekli olabilirsin");
            }


        } else if (cinsiyet=='e' || cinsiyet=='E') { // Erkek
            if (yas<16 || yas>80){
                System.out.println("Gecersiz yas girisi, lutfen tekrar deneyin");
            } else if (yas<65) {
                System.out.println("Emekli olmak icin daha " + (65-yas) + " yil daha calismalisin");
            }else{
                System.out.println("Emekli olabilirsin");
            }

        }else {
            System.out.println("Gecersiz cinsiyet girisi, lutfen yeniden deneyin");
        }


    }
}
