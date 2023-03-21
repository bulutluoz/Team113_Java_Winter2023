package day35_interfaces;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_Exceptions {

    public static void main(String[] args) {

        int sayi1 = 20;
        int sayi2 = 5;


        System.out.println(sayi1 / sayi2); // ArithmeticException


        Scanner scanner= new Scanner(System.in);
        System.out.println("Lutfen bir tamsayi giriniz");
        int sayi3= 0; // InputMismatchException

        try {
            sayi3 = scanner.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Sana tamsayi yaz dedikkkkk .... ");
        }

        if (sayi3 == 0){
            System.out.println("sifir giremezsiniz");
        }else{
            System.out.println(sayi1 / sayi3);
        }


    }
}
