package day21_arrayList_forEachLoop;

import java.util.Arrays;

public class C05_IstenenHarfAdediniBulma {

    public static void main(String[] args) {

        //Soru 4- Kullanicidan bir cumle ve bir harf alin,
        //       harf cumlede kullanilmissa kac kere kullanildigini yazdirin,
        //       kullanilmadiysa “harf cumlede kullanilmamis” yazdirin.

        String cumle = "Yatin kalkin Java calisin";
        String istenenHarf= "x";

        String[] karakterler= cumle.split("");

        System.out.println(Arrays.toString(karakterler));
        // [Y, a, t, i, n,  , k, a, l, k, i, n,  , J, a, v, a,  , c, a, l, i, s, i, n]


        int sayac=0;

        for (String each : karakterler
             ) {

            if (each.equalsIgnoreCase(istenenHarf)){
                sayac++;
            }
        }


        if (sayac==0){
            System.out.println("Istenen harf cumlede kullanilmamis");
        }else {
            System.out.println("istenen harf cumlede " + sayac + " adet kullanilmis");
        }
    }
}
