package day19_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_TekrarlardanKurtulma {
    public static void main(String[] args) {

        // verilen bir array'den tekrar eden sayilari silip
        // her bir elementin sadece bir kez kullanildigi bir hale donusturun


        int[] arr = {3,4,5,6,3,4,2,3,5,4,6,5,4,3,5,7};

        // bir tane bos list olusturalim
        // array'deki her bir elemani ele alalim
        // ele aldigimiz element list'de yoksa ekleyelim, varsa eklemeyelim
        // boylece benzersiz elementlerden olusan bir list olusturalim

        List<Integer> benzersizElementlerList = new ArrayList<>();

        for (int i = 0; i < arr.length ; i++) {

            if (!benzersizElementlerList.contains(arr[i])){
                benzersizElementlerList.add(arr[i]);
            }
        }

        System.out.println(benzersizElementlerList); // [3, 4, 5, 6, 2, 7]
        // istenen listeyi list olarak elde ettik
        // bunu arr'ye direk atayamayiz

        arr= new int[benzersizElementlerList.size()]; // [0, 0, 0, 0, 0, 0]

        for (int i = 0; i < arr.length ; i++) {

            arr[i] = benzersizElementlerList.get(i);
        }


        System.out.println(Arrays.toString(arr)); // [3, 4, 5, 6, 2, 7]


    }
}
