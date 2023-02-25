package day17_arrays;

import javax.swing.*;

public class C02_ArraydeIstenenElemaniBulma {

    public static void main(String[] args) {

        // Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini
        //         ve varsa kac kere kullanildigini yazdiran bir method olusturun.

        int[] arr1 = {2,4,5,2,6,4,7,3,5};

        elemanSayisiYazdir(arr1,3); //1
        elemanSayisiYazdir(arr1,2); //2
        elemanSayisiYazdir(arr1,5); //2

        String[] arr2= {"E","H","M","H","H","E"};
        elemanSayisiYazdir(arr2,"E"); //2
        elemanSayisiYazdir(arr2,"H"); //3


    }

    public static void elemanSayisiYazdir(int[] arr , int arananElement){

        int sayac=0;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i] == arananElement){
                sayac++;
            }
        }

        System.out.println(sayac);

    }

    public static void elemanSayisiYazdir(String[] arr , String arananElement){

        int sayac=0;

        for (int i = 0; i < arr.length ; i++) {

            if (arr[i].equals(arananElement)){
                sayac++;
            }
        }

        System.out.println(sayac);

    }
}
