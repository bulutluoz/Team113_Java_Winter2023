package day07_genelTekrar_ifElseStatements;

import java.util.Scanner;

public class C02_IfElseIf {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Dönemsonu Notunuzu Giriniz : ");
        double not= scan.nextDouble();

        if(not>100 || not<0){
            System.out.println("Notunuzu Yanlış Girdiniz. Lütfen Tekrar Giriniz :");

        } else if (not>=85) {
            System.out.println("Tebrikler AA İle Geçtiniz.");

        }  else if (not>=65 ) {
            System.out.println("Tebrikler BB İle Geçtiniz.");

        } else if (not>=50) {
            System.out.println("CC İle Geçtiniz.");

        }else System.out.println("DD -> Maalesef Dersten Kaldınız...");
    }
}
