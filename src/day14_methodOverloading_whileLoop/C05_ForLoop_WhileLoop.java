package day14_methodOverloading_whileLoop;

public class C05_ForLoop_WhileLoop {
    public static void main(String[] args) {

        /*
            baslangic ve bitis degeri belli olan
            veya kac kere tekrar edilecegi bilinen loop'larda
            for loop ideal olarak kullanilabilir

            Ancak tekrar sayisi belli olmayan
            baslangic veya bitisi baska bir variable'a bagli olan durumlarda
            for loop yerine while loop tercih edilir
         */

        // 50 ve 100 arasindaki (sinirlar dahil)
        // sayilari toplayin

        int toplam=0;

        for (int i = 50; i <=100 ; i++) {

            toplam +=i;
        }

        System.out.println("Toplam  : " + toplam);


        // ayni soruyu while loop ile yapalim
        // for loop'da 3 seyi takip ederiz
        //  1- baslangic degeri
        //  2- bitis sarti
        //  3- artis veya azalis sekli

        toplam =0;
        int sayi=50;

        while (sayi<=100){

            toplam += sayi;

            sayi++;
        }

        System.out.println("while ile toplam : " + toplam);
    }
}
