package day22_constructor;

public class C02_Hemsire {

    /*
        ornegin bir hastane programinda,
        hastanede calisacak Hemsirelerin hangi bilgilerini tutmak istiyorsak,
        hangi method'lari hemsireler kullanmak istiyorsak
        bir hemsire class'i olusturup
        tum bu ozellikleri(variable ve method'lari) o class'da olustururuz

        programda ne zaman bir hemsireye ihtiyac olsa
        hemsire class'indan obje olustururuz
        boylece otomatik olarak tum ozelliklere sahip olur

     */

    String isim;
    String soyisim;
    String telNo;
    String adres;
    int yas;
    boolean izindeMi;
    char evliMi;
    int ekMesaiUcreti=20;

    public int  mesaiUcretiHesapla(int mesaiSaati){

        return mesaiSaati*ekMesaiUcreti;
    }
}
