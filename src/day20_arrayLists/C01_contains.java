package day20_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C01_contains {

    public static void main(String[] args) {

        // uzun bir listeyi java'da list olarak kaydetmek istersek
        // tek tek eklemek istemezseniz
        // pratik olarak bir array olusturup,
        // loop ile tum elementleri list'e ekleyebiliriz


        int[] arr ={2,3,5,4,3,6,7,5,4,3,2,5,6,8,6,5,1};

        List<Integer> sayilar= new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {

            sayilar.add(arr[i]);
        }

        System.out.println(sayilar); // [2, 3, 5, 4, 3, 6, 7, 5, 4, 3, 2, 5, 6, 8, 6, 5, 1]

        // listede element olarak 3 var mi ?
        System.out.println(sayilar.contains(3)); // true

        System.out.println(sayilar.contains(9)); // false

        sayilar.clear();

        System.out.println(sayilar); // []
    }
}
