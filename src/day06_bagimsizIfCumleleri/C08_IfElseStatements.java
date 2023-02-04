package day06_bagimsizIfCumleleri;

import java.util.Scanner;

public class C08_IfElseStatements {

    public static void main(String[] args) {

        // Soru 5- Kullanicidan bir karakter isteyin,
        //         girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        //         yoksa girilen karakteri yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz");

        char krk = scan.next().charAt(0);

        if ('a'<= krk && krk<='z'){

            System.out.println(Character.toUpperCase(krk));
        }else {
            System.out.println(krk);
        }
    }
}
