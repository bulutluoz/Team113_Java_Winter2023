package day17_arrays;

import java.util.Arrays;

public class C06_ArrayElemanEklemeMethodu {
    public static void main(String[] args) {

        // verilen bir array'e istenen bir elementi ekleyip,
        // yeni halini bize donduren bir method olusturun

        int[] arr = {2,4,7,8};

        // arr'ye method'u kullanarak 5 ekleyin

        arr=arrayeElementEkle(arr,5);
        arr=arrayeElementEkle(arr,3);
        arr=arrayeElementEkle(arr,19);

        System.out.println(Arrays.toString(arr));


    }

    public static int[] arrayeElementEkle(int[] arr , int eklenecekElement){

        int[] yeniArr= new int[arr.length+1]; // [0,0,0,0,0]

        for (int i = 0; i < arr.length ; i++) {

            yeniArr[i]=arr[i];
        } // yeniArr [2,4,7,8,0]

       yeniArr[yeniArr.length-1] = eklenecekElement;

        return yeniArr;

    }
}
