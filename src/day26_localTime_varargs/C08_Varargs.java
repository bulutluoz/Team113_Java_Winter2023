package day26_localTime_varargs;

import java.util.Arrays;

public class C08_Varargs {

    public static void main(String[] args) {

        topla(3,4); // [3, 4] 7
        topla(3,4,5); // [3, 4, 5] 12
        topla(3,4,5,6,7); // [3, 4, 5, 6, 7] 25
        topla(1,2,3,4,5,6); // [1, 2, 3, 4, 5, 6] 21
        topla(1,2,3,5,6,8,9); // [1, 2, 3, 5, 6, 8, 9]  34
    }

    public static void topla(int... a){

        System.out.println(Arrays.toString(a));

        int toplam=0;

        for (int each:a
             ) {
            toplam += each;
        }
        System.out.println("Toplam : " + toplam);
    }
    /*
        java'da bir method parametrelerine uygun argumente sahip
        method call oldugunda calisir

        Ornegin 2 int parametre varsa
        sadece 2 int argument ile method call yapildiginda calisir

        Java ayni data turune sahip olmak sartiyla
        parametre sayisini esnek tutabilmek icin varargs olusturmustur

        varargs bir ARRAY'dir

        dolayisiyla method'da array elementlerini
        istedigimiz isleme uygun olarak kullanabiliriz

     */
}
