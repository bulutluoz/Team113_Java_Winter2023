package day05_incrementDecrement_Concatenation;

public class C02_PreIncrement_PostIncrement {

    public static void main(String[] args) {

        /*
            Eger sayinin degeri SADECE 1 artacak veya azalacaksa

            artirip sonra yazdirma/atama
            yazdirip sonra artirma/atama

            islemlerini tek satirda yapabiliriz
         */

        // a'nin degerini 1 artirin ve yeni degerini olusturacaginiz b variable'ina atayin

        int a=20;

        int b = ++a; // once artitir sonra atama yapar
        /*
        a++;
        int b = a;
         */



        System.out.println( "a : " + a + ", b : " + b); // a : 21, b : 21


        // a'nin degerini b'ye atayin, sonra a'nin degerini 1 artirin

        a=20;
        b=a++; // once atama yapar, sonra artirir

        /*
        b=a;
        a++;
         */

        System.out.println( "a : " + a +", b : " + b); // a : 21, b : 20



        // a'nin degerini yazdirin ve sonra a'yi 1 artirin

        a=20;
        System.out.println("a : " + a); // a: 20
        a++;
        System.out.println("=======");

        a=20;
        System.out.println("a : " + a++); // a: 20
        System.out.println("Bir sonraki satirda a : " + a); // Bir sonraki satirda a : 21


        // a'nin degerini 1 azaltin ve sonra a'nin degerini yazdirin
        a=20;
        System.out.println(--a); // // a: 19
        System.out.println("Bir sonraki satirda a : " + a); // Bir sonraki satirda a : 19
    }
}
