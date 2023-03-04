package day22_constructor;

public class C03_HemsireRunner {
    public static void main(String[] args) {
        /*
            bir obje olustururken parametre olarak hic bir deger girilmezse
            olusturulan obje, olusturuldugu class'daki variable'lara atanan degerleri alir
            eger obje olusturulan class'da deger atamasi yoksa, Java default degerleri atar
         */

        C02_Hemsire hemsire1= new C02_Hemsire();

        System.out.println(hemsire1.isim); // Isim atanmamis
        System.out.println(hemsire1.evliMi); // hiclik
        System.out.println(hemsire1.yas);//0
        System.out.println(hemsire1.izindeMi); // false

        hemsire1.isim="Tuba";
        hemsire1.yas=29;

        System.out.println(hemsire1.isim); // Tuba
        System.out.println(hemsire1.yas);//29


    }
}
