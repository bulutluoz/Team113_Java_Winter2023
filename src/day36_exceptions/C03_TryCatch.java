package day36_exceptions;

public class C03_TryCatch {

    public static void main(String[] args) {

        int sayi1 = 20;
        int sayi2 = 0;


        try {

            System.out.println(sayi1/sayi2);
            System.out.println("deneme1");
            System.out.println("deneme2");
            System.out.println("deneme3");

        } catch (ArithmeticException e) {

            System.out.println("Bolen sifir olmamali");
        }

        /*
            Bir try blogunda exception olusursa
            o satirdan catch satirina kadar aradaki tum kodlar IGNORE edilir

            eger try blogunda exception olusmazsa
            catch devreye girmez
            (if - else gibi)
         */
    }
}
