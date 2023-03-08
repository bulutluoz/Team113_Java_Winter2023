package day25_passByValue_ImmutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C01_PassByValue {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(3);
        sayilar.add(4);
        sayilar.add(5);
        System.out.println(sayilar); // [3, 4, 5]

        elementleriArtir(sayilar);
        // elementleri artir methodunu calistirdiktan sonra
        System.out.println("element artir methodundan sonra "+ sayilar);

        yeniListeAta(sayilar);
        System.out.println("Yeni liste ata method'undan sonra : " + sayilar);
    }

    public static void elementleriArtir(List<Integer> sayilar){
        // tum elementleri 2 katina cikaralim

        for (int i = 0; i < sayilar.size() ; i++) {

            sayilar.set(i, 2*sayilar.get(i));
        }
        System.out.println("elementleri artir methodunda :" + sayilar);
    }

    public static void yeniListeAta(List<Integer> sayilar){

        // sayilar listesine yeni bir list degeri atayip
        // sonra 1,2,3 elementlerini ekleyin

        sayilar = new ArrayList<>();

        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(3);

        System.out.println("Yeni liste ata methodunda : " + sayilar);

    }
}





















