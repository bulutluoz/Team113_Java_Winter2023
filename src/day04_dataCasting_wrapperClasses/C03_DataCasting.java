package day04_dataCasting_wrapperClasses;

public class C03_DataCasting {

    public static void main(String[] args) {

        int a= 20;
        int b= 6;

        System.out.println(a/b); // 20 / 6 = 3

        // Java bolunen iki sayi tamsayi ise sonucun da tamsayi kismini verir

        double c=6;
        System.out.println(a/c); // 20 / 6 = 3.3333333333333335
        // int / double ==> double

        // bolunen sayilarin data turleri farkli ise sonucu daha genis olanin cinsinden verir

        float d= 6f;

        System.out.println(a/d); // 20 / 6 = 3.3333333


        // a/b isleminin sonucunu ondalikli olarak nasil yazdirabiliriz ?

        System.out.println( (double) (a/b) ); // 3.0

        // islem onceligi (a/b)'dedir.
        // Java oncelikle (a/b) islemini yapar ve sonucu 3 bulur
        // sonra (double) oldugundan 3'u double'a cast eder 3.0 bulur


        // bolme isleminin sonucunun double olmasi icin
        // isleme girenlerden birisi double olmalidir

        System.out.println((double) a/b); // 3.3333333333333335

        System.out.println(a/(double)b); // 3.3333333333333335


        int e= 1467;

        System.out.println(e=e/10); // 146

        System.out.println(e); // 146

        e= e/10;

        System.out.println(e); //  14

        e=e/10;
        System.out.println(e); // 1

        e=e/10;
        System.out.println(e); // 0


    }
}
