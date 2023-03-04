package day22_constructor;

public class C04_Doktor {

    C04_Doktor(){
        System.out.println("parametresiz constructor calisti");
    }

    String isim="Isim atanmamis";
    String soyisim="Soyisim atanmamis";
    String telNo;
    String adres;
    int yas;
    boolean izindeMi;
    char evliMi;
    int ekMesaiUcreti=30;

    public int  mesaiUcretiHesapla(int mesaiSaati){

        return mesaiSaati*ekMesaiUcreti;
    }
}
