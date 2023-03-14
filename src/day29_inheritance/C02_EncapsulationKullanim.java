package day29_inheritance;

public class C02_EncapsulationKullanim {
    public static void main(String[] args) {

        C01 obj = new C01();

        obj.isim="Melike"; // write
        System.out.println(obj.isim); // read


        obj.setSayi(40); // write
        System.out.println(obj.getSayi()); // 40 read

        /*
            bir class uyesinin public olmasi ile
            private yapilip, getter ve setter method'larinin olusturulmasi
            islevsel acidan ayni sonucu olusturur

            Bazi developer'lar set(write) ve get(read) yekilerinin
            kullanildigini vurgulamak icin
            2.yontemi tercih ederler.
         */
    }
}
