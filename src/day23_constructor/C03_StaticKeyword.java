package day23_constructor;

public class C03_StaticKeyword {

    static String hastaneismi="Yildiz Hastanesi";
    static String hastanetelefonu= "3122343434";
    static String bashekimIsmi= "Kemal Aydin";

    String persIsmi;
    String perAdresi;
    String perTelefonu;

    public static void main(String[] args) {

        C03_StaticKeyword personel1= new C03_StaticKeyword();

        System.out.println(personel1.persIsmi); // null
        System.out.println(hastaneismi); // Yildiz
        System.out.println(personel1.bashekimIsmi); // kemal




        C03_StaticKeyword personel2= new C03_StaticKeyword();

        personel2.persIsmi="Dogan";

        System.out.println(personel2.persIsmi); // Dogan
        System.out.println(personel1.persIsmi); // null


        personel2.bashekimIsmi= "Sumeyra Gunel";
        System.out.println(personel1.bashekimIsmi);



        /*
            1- static variable'lar tum class icin gecerlidir (class variable)
            2- static variable'lar tun objeler icin ayni degeri tasidiklari icin
               her obje icin ayrica olusturulmaz, sadece 1 variable olur
            3- static variable'lara ulasmak veya update etmek icin obje ismi kullanmaya gerek yoktur
               direk ulasilabilir.
               Baska class'dan static variable'a ulasmak icin classismi.staticVariableIsmi yazilir
         */
    }
}
