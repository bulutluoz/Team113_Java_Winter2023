package day17_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class C07_KullanicidanDegerAlarakArrayOlustur {

    public static void main(String[] args) {

        // Kullanicidan array olusturmak uzere pozitif tamsayilar alin
        // kullaniciya islemi bitirmesi icin 0'a basmasi gerektigini soyleyin
        // bir onceki class'dan method kullanarak aldiginiz elementleri arr'e ekleyin

        Scanner scan = new Scanner(System.in);
        int girilenSayi=1;
        int[] arr= new int[0];//[]

        while (girilenSayi != 0){
            System.out.println("Array'e eklemek icin pozitif tamsayilar girin" +
                    "\nislemi bitirmek icin 0'a basin");
            girilenSayi = scan.nextInt();

            if (girilenSayi !=0){

                arr=C06_ArrayElemanEklemeMethodu.arrayeElementEkle(arr,girilenSayi);
            }

        }

        System.out.println(Arrays.toString(arr));
    }
}
