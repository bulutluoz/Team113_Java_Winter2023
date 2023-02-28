package day19_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C03_add {
    public static void main(String[] args) {
        /*
            List data turu olarak primitive kabul etmez
         */

        List<Integer> sayilar = new ArrayList<>();

        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(2);

        System.out.println(sayilar); // [3, 5, 2]

        // 3 ile 5 arasina element olarak 7 ekleyin

        sayilar.add(1,7);

        System.out.println(sayilar); // [3, 7, 5, 2]

        List<Integer> ekler = new ArrayList<>();
        ekler.add(4);
        ekler.add(6);

        System.out.println(ekler); // [4, 6]

        sayilar.addAll(ekler);

        System.out.println(sayilar); // [3, 7, 5, 2, 4, 6]

        // 7 ile 5 arasina ekler'i ekleyin

        sayilar.addAll(2,ekler);

        System.out.println(sayilar); // [3, 7, 4, 6, 5, 2, 4, 6]

    }
}
