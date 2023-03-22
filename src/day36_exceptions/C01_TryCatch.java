package day36_exceptions;

public class C01_TryCatch {

    public static void main(String[] args) {

        /*
            Kodlarimizi yazarken
            sorun olusma ihtimali gordugumuzde
            sorun cikma potansiyeli olan kodlari
            try - catch - (finally) blok(lar)i ile cevreleriz


         */


        int sayi1 = 20;
        int sayi2 = 0;


        try {

            System.out.println(sayi1/sayi2);

        } catch (ArithmeticException e) {

            // e.printStackTrace(); exception'da gordugumuz tum hata aciklamalarini yazdirir
            // System.out.println("Bolen sayi 0 olamaz");

            // System.out.println(e.getMessage()); / by zero hatanin kaynagini gosterdi
            // System.out.println(e.getCause());

        }

        /*
            bir try catch blogu 3 bolumden olusur

            1-  try blogu : 21-25(haric)
                exception olusturma potansiyeli olan kodlar

            2-  catch (Exception e)
                catch statement :
                ArithmeticException : olusma ihtimali olan exception
                e : karsilastigi exception'i kaydedecegimiz obje
            3-  catch blogu : 25(haric) - 29 arasi
                ongorulen exception gerceklestiginde
                calismasini istedigimiz kodlar
         */

    }
}
