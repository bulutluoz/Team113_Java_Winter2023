package day45_maps_THE_END;

import java.util.HashMap;
import java.util.Map;

public class C03_NestedMap {
    public static void main(String[] args) {

        /*
        okulMap.put(101, "Ali-Cem-10-H-MF");
        okulMap.put(102, "Veli-Can-10-M-TM");
        okulMap.put(103, "Ali-Can-11-M-Soz");
         */

        // ogrencileri ayri ayri map yapsak

        Map<String,String > ogrenci1Map = new HashMap<>();
        ogrenci1Map.put("Isim","Ali");
        ogrenci1Map.put("Soyisim","Cem");
        ogrenci1Map.put("Sinif","10");
        ogrenci1Map.put("Sube","H");
        ogrenci1Map.put("Bolum","MF");

        Map<String,String > ogrenci2Map = new HashMap<>();
        ogrenci2Map.put("Isim","Veli");
        ogrenci2Map.put("Soyisim","Can");
        ogrenci2Map.put("Sinif","10");
        ogrenci2Map.put("Sube","M");
        ogrenci2Map.put("Bolum","TM");

        Map<String,String > ogrenci3Map = new HashMap<>();
        ogrenci3Map.put("Isim","Ali");
        ogrenci3Map.put("Soyisim","Can");
        ogrenci3Map.put("Sinif","11");
        ogrenci3Map.put("Sube","M");
        ogrenci3Map.put("Bolum","Soz");

        Map<Integer, Map<String,String >> okulMap= new HashMap<>();
        okulMap.put(101,ogrenci1Map);
        okulMap.put(102,ogrenci2Map);
        okulMap.put(103,ogrenci3Map);

        System.out.println(okulMap);
        /*
        {   101={Bolum=MF, Soyisim=Cem, Sube=H, Sinif=10, Isim=Ali},
            102={Bolum=TM, Soyisim=Can, Sube=M, Sinif=10, Isim=Veli},
            103={Bolum=Soz, Soyisim=Can, Sube=M, Sinif=11, Isim=Ali}}
         */

        // 101 numarali ogrencinin sinifini yazdirin

        System.out.println(okulMap.get(101).get("Sinif")); // 10

        // 103 numarali ogrenci ile, 102 numarali ogrencinin subeleri ayni mi ?
        System.out.println(okulMap.get(103).get("Sube").equals(okulMap.get(102).get("Sube"))); // true


    }
}
