package day13_methodOlusturma;

import day14_methodOverloading_whileLoop.C02_isAsal;

import java.util.Scanner;

public class C06_MethodKullanma {

    public static void main(String[] args) {
        // Verilen bir String'in Palindrome olup olmadigini yazdirin
        // Palindrome : duzden ve tersten ayni sekilde yazilan
        // madam, 12321, kabak

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir metin giriniz");

        String metin = scan.nextLine();

        String tersMetin = C05_StringiTerseCevirme.stringTersineCevir(metin);

        if (metin.equals(tersMetin)){
            System.out.println("Girilen metin PALINDROME");
        } else{
            System.out.println("Girilen metin PALINDROME degil");
        }


    }
}
