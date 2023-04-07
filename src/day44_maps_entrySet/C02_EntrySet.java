package day44_maps_entrySet;

import day39_maps.MapMethodDepo;

import java.util.Map;

public class C02_EntrySet {
    public static void main(String[] args) {

        // verilen okulMap'indeki soyisimleri buyuk harfe cevirin.

        Map<Integer,String> okulMap = MapMethodDepo.ornekMapOlustur();
        System.out.println(okulMap);

        okulMap = MapMethodDepo.soyisimleriBuyukYap(okulMap);
        System.out.println(okulMap);
    }
}
