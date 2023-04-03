package day40_maps;

import day39_maps.MapMethodDepo;

import java.util.Map;

public class C03_Update {

    public static void main(String[] args) {

        // verilen map'de, verilen numarali ogrencinin
        // soyismini istenen deger olarak degistirin

        Map<Integer,String> okulMap = MapMethodDepo.ornekMapOlustur();

        System.out.println(okulMap);

        okulMap = MapMethodDepo.numaraIleSoyisimDegistir(okulMap,102,"Han");

        okulMap = MapMethodDepo.numaraIleSoyisimDegistir(okulMap,103,"Kibar");

        System.out.println(okulMap);

    }
}
