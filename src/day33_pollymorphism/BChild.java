package day33_pollymorphism;

import java.util.List;

public class BChild extends AParent{

    @Override
    void method1() {
        // super.method1();
        // burada super. olursa hem child class'daki method1
        // hem de super class'daki method1 calisir

    }


    void method2(){
        /*
            bir method override edildiginde
            child class'da @Override notasyonu KULLANILABILIR

            kullanmak veya kullanmamak arasinda
            pratikte soyle bir sonuc olusur.

            eger notasyon kullanilirsa
            iki method arasindaki iliski takip edilir
            parent class'daki method silinirse
            notasyon CTE verir

            notasyon yoksa
            parent class'daki overriden method silinirse
            bir uyari verilmez, CTE olusmaz

         */
    }

      Double method3(){
        /*
            Overridden method ile overriding method'un
            isim ve signature'lari ayni olmalidir

            return type ve access modifier
            signature'a dahil degildir
            ancak overriding'de bunlarla ilgili de kurallar vardir

            1- access modifier kurali :
                child parent'i kisitlayamaz

                eger overridden ve overriding method'lari
                private yaparsak
                bu iki method BAGIMSIZ OLARAK calisir
                aralarinda override islemi olmaz

             2- Return type kurali
                return type primitive veya void ise
                iki method'un return type'i AYNI OLMALIDIR

                non-primitive oldugunda
                ya ayni olmali
                veya parent class'daki return Type
                child class'daki return type'in parent'i OLMALI
                (Covariant data )

         */

        return 5.0;
    }
}
