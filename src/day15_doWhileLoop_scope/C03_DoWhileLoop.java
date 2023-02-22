package day15_doWhileLoop_scope;

public class C03_DoWhileLoop {

    public static void main(String[] args) {
        /*
               While loop'da bitis sarti kontrolu her zaman body'den bir fazla calisir
               while loop'da kullanicidan alacagimiz degerlere once bizim deger atamamiz gerekir
               bu da bazan hatalara sebep olur
         */

        int sayi = -10;
        int toplam = 0;

        while (sayi>0){

            toplam += sayi*sayi;
            sayi--;
        }

        System.out.println("while toplam : " + toplam);

        sayi= -10;
        toplam = 0;

        do {
            toplam += sayi*sayi;
            sayi--;

        }while(sayi>0);

        System.out.println("do while toplam : " + toplam);
    }
}
