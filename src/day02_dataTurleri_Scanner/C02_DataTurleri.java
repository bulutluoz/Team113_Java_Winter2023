package day02_dataTurleri_Scanner;

public class C02_DataTurleri {

    public static void main(String[] args) {

        char ilkHarf= '8'; // Tek tirnak icinde tek karakter(harf,sayi,ozel karakter...)


        byte ogrYasi1=15; // en dogru kullanim bu olur, hafiza kullanimini optimize etmek icin bu yeterlidir
        short ogryasi2=16;
        int ogrYasi3=14;
        long ogrYasi4=15;

        double sayi1=3.1234567890123453789;
        System.out.println(sayi1); // 3.1234567890123457

        // Double virgulden sonra 16 hane yazdirir, ama cok kucuk sayilara indigi icin
        // ondalikli kismin sonunda hatalar olabilir
        // 15 / 3 = 4.999999999999999  5.0  5.00000000000001

        float sayi2 = 45.543334578465354648f;
        // float sayi tanimladigimizda double'dan farkli oldugunu belirtmek icin
        // sonuna f veya F yazmak zorundayiz
        System.out.println(sayi2); // 45.543335


        // Biz dersler boyunca hafiza onemli olmadigi icin
        // tamsayilar icin int, ondalikli sayilar icin de double kullaniriz
    }
}
