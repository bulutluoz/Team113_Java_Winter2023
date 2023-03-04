package day22_constructor;

import day21_arrayList_forEachLoop.C04_KarelerinToplami;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C01_Constructor {

    public static void main(String[] args) {

        /*
            Bir obje ancak bir class'dan olusturulabilir.
            Bir objeyi olusturdugumuz class, ayni zamanda o objenin data turudur.

            Her obje olusturuldugu class'in ozelliklerini tasir

            Eger bir programda, ortak ozelliklere sahip
            objeler uretmek uzere tasarladiginiz bir class varsa main method olmasi SART DEGILDIR
            Bu class'lar kaliphane gibi calisir
            Yani o class'dan ayni ozelliklere sahip objeler uretmemizi saglar



         */

        Scanner scan = new Scanner(System.in);

        List<String> isimler = new ArrayList<>();

        C04_KarelerinToplami obje = new C04_KarelerinToplami();

        Random rnd = new Random();

        String str = new String("Ali");

        C02_Hemsire hemsire1 = new C02_Hemsire();
        System.out.println(hemsire1.mesaiUcretiHesapla(5));


        String str2;
        Random rnd2;
        List<String> harfler;


    }
}
