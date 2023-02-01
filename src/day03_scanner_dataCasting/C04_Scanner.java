package day03_scanner_dataCasting;


import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        //Soru 7 (Interview)- Kullanicidan iki sayi alip ikisinin degerlerini degistirin(swap).


        // kullanici sayi1= 10 , sayi2= 20 degeri girdiginde
        // sayi1'in yeni degeri= 20 , sayi2'nin yeni degeri= 10 olmali


        Scanner scan = new Scanner(System.in);

        System.out.println("Sayi1'i giriniz(Tamsayi)");

        int sayi1= scan.nextInt();

        System.out.println("Sayi2'i giriniz(Tamsayi)");

        int sayi2 = scan.nextInt();

        int temp=0;

        temp=sayi2;


        sayi2=sayi1;


        sayi1=temp;


        System.out.println("Sayi1'in yeni degeri : " + sayi1);
        System.out.println("Sayi2'in yeni degeri : " + sayi2);


    }
}
