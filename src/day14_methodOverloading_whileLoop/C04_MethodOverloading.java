package day14_methodOverloading_whileLoop;

public class C04_MethodOverloading {
    public static void main(String[] args) {
        /*
            Java overloading kurallari
            1- isim ve parametreleri ayni olan birden fazla method olusturulamaz
            2- data turleri farkli olan parametrelerin yerlerini degistirirsek
               java yeni bir method olarak kabul eder (int, double) (double,int)

            Overloading olan class'larda
            Java hangi method'un calistirilacagina su sekilde karar verir

            1- cagrilan isimde method var mi ?
            2- method call'da kullanilan arguments ile method'lardaki
               parametrelerin %100 uyumlu oldugu var mi ?
            3- argument ile parametre ayni olmasa bile
               verilen argumentleri kabul edecek parametre var mi ?
            4- Casting ile birden fazla method'u kullanabiliyorsa
               daha az casting ile calisacak method'u kullanir
         */

        topla(3,5); // 8
        topla(3.4,2.3); // 5.7

        // topla("ali","veli");  CTE bu argument'leri kabul edebilecek parametre yok

        topla('a','b'); // iki int 195

        topla(3f , 4f); // iki double 7.0

        topla(3f , 4); // double ve int 7.0

    }

    public static void topla(int a , int b){
        System.out.println("iki tamsayinin toplami : " + (a+b));
    }

    public static void topla(double a, double b){
        System.out.println("iki double sayinin toplami : " + (a + b));
    }

    public static void topla(int sayi1, double sayi2){ // topla int double
        System.out.println("int ve double sayilarin toplami : " + (sayi1+sayi2));
    }

    public static void topla(double sayi1 , int sayi2){ // topla double int
        System.out.println("double ve int sayilarin toplami : " + (sayi1+sayi2));
    }
}
