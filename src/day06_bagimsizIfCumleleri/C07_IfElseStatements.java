package day06_bagimsizIfCumleleri;


import java.util.Scanner;

public class C07_IfElseStatements {

    public static void main(String[] args) {
        //Soru 4- Kullanicidan bir karakter girmesini isteyin,
        //        girilen karakterin buyuk harf olup olmadigini yazdirin.


        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz");

        char krk = scan.next().charAt(0);

        // r ===> A ile Z arasinda mi ?

        if ('A'<= krk && krk <= 'Z'){
            System.out.println("Girilen karakter buyuk harf");
        }else{
            System.out.println("Girilen karakter buyuk harf degil");
        }
    }
}
