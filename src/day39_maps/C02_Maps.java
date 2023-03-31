package day39_maps;

import java.util.Map;

public class C02_Maps {

    public static void main(String[] args) {

        Map<Integer,String> okulMap = MapMethodDepo.ornekMapOlustur();

        okulMap.put(110,"Kerem-Umut-12-K-MF");

        System.out.println(okulMap.keySet()); // [101, 102, 103, 104, 105, 106, 110]

        System.out.println(okulMap.values());
        // [Ali-Cem-10-H-MF,
        //  Veli-Can-10-M-TM,
        //  Ali-Can-11-M-Soz,
        //  Ayse-Cem-11-H-TM,
        //  Ayse-Han-10-H-MF,
        //  Veli-Han-10-H-MF,
        //  Kerem-Umut-12-K-MF]

        // Verilen sube'deki ogrencilerin sinif, isim ve soyisimlerini
        // basta sira no olacak sekilde, her satirda bir ismin olacagi
        // bir liste seklinde yazdirin


        MapMethodDepo.subeOgrenciListesiYazdir(okulMap,"m");

    }
}
