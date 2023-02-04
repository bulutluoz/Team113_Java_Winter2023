package day06_bagimsizIfCumleleri;

public class C01_ifStatements {

    public static void main(String[] args) {

        /*
            Buradaki sartlar birbirinden bagimsizdir
            uygun sayilar olursa 3 if body'si de calisabilir
            bazen de hicbir if body'si devreye girmeyebilir

            kodumuz konsolda hicbir sey yazdirmadi
            ancak
            Process finished with exit code 0
            yazmasindan kodun hicbir sorun olmadan calistigini anliyoruz

            sadece degerler sartlari saglamadigi icin
            konsolda bir sey yazdirilmadi
         */

        int a = 13;

        int b = 97;

        if (a>b){
            System.out.println("a b'den buyuk");
        }

        if (a%2==0){
            System.out.println("a cift sayidir");
        }

        if (b>100){
            System.out.println("b 100'den buyuktur");
        }

        boolean sonuc = a*7 > b ;
        /*
           bazen if statement'da direk boolean bir deger sart olarak yazilabilir
           bu durumda boolean variable degeri true ise if body calisir,
           false ise if body calismaz
         */

        if (sonuc) {
            System.out.println("istenen sart saglandi" );
        }


    }
}
