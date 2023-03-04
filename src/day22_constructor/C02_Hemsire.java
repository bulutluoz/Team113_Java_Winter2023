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

        Eger biz istedigimiz parametrelere sahip bir constructor olusturmazsak
        Java class'dan obje olusturulabilmesi icin,
        class'a default bir constructor koyar.

        Default constructor GORUNMEZ,
        parametresi yoktur, cons. body'si bostur

        C02_Hemsire (){

        }

        Biz de istedigimiz parametrelere sahip,
        istedigimiz kadar constructor olusturabiliriz

        COK ONEMLI : Eger biz bir constructor olusturursak
                     yani class'da gozle gorunen bir constructor varsa
                     Java default constructor'i siler
                     Bizim olusturdugumuz hic bir constructor'a default constructor DENEMEZ

     */




    String isim="Isim atanmamis";
    String soyisim="Soyisim atanmamis";
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
