package day40_maps;

import day39_maps.MapMethodDepo;

import java.util.Map;

public class C02_Update {

    public static void main(String[] args) {

        // verilen okul map'inde
        // ogrencilerin siniflarini bir artirin
        // eger 12.sinif varsa, sinif bilgisi olarak mezun yazin

        // eger update varsa, key ve value birlikte dusunulmelidir
        // ayni key ile yeni value'yu map'e ekledigimizde
        // key unique olacagi icin eski value'yu update edip yeni value degerini kaydeder


        Map<Integer,String> okulMap = MapMethodDepo.ornekMapOlustur();
        System.out.println(okulMap);
        okulMap = MapMethodDepo.yilSonuSiniflariDegistir(okulMap);
        System.out.println(okulMap);

        // denemek icin bir kere daha calistiralim
        okulMap = MapMethodDepo.yilSonuSiniflariDegistir(okulMap);
        System.out.println(okulMap);

    }
}
