package day02_dataTurleri_Scanner;

public class C03_NonPrimitiveDataTurleri {

    public static void main(String[] args) {

        String isim = "Ali Can";

        String ilkHarf="K";
        char ilkHarf2='m';

        // tek bir karakter atayacaksak ikisini de kullanabiliriz

        System.out.println(ilkHarf.toLowerCase()); // k
        System.out.println(ilkHarf2);

        // primitive data turundeki variable'lar sadece DEGER tasiyabilir
        // non-primitive data turundeki variable'larin hem deger hem de method'lari olur

        String metin ="hbadcjabclkjbd;vkjba;dkjvb;ksjdvb;kjsbv" +
                "skdvbjksjbvljsbdvljsbvljsbdvljbsdvljsdvlkjb" +
                "kjdvbkjsdbvkjsbdvljsbdvlkjsbvljsbvlsbvljbs" +
                "skjdbvljsdbvljsdbnvlksndv;ksnd;ksndv;" +
                "slkdnlskdnv;lasmff;leaf;knd;vkns;kdvn;knf" +
                "slkdnv;ksndv;lsdnmv;lsdm;lsnmdv;lsdv" +
                "slkdnv;ksdnv;ksdnv;sdv;lksdv;dln";

        String not="not";
        String Not="Vaiable isimlerinin buyuk harf ile baslamasi tavsiye edilmez ama java kabul eder";
        String nOT="Bir kere deklare edilen variable tekrar deklare edilemez";
        String noT="ama isimler farkli sekilde yazildigi icin java bunlari farkli variable olarak kabul eder";

        // camelCase : kucuk harfle baslar, sonraki kelimeler bitisik yailir ve ilk harfi buyuk olur
        // ilkHarf, ogrenciNo, okulDefteriDolabi
        // naming convention
    }
}
