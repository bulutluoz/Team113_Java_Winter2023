package day36_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C04_CheckedExceptions {

    public static void main(String[] args) throws FileNotFoundException {

        /*
            Checked exceptions kod yazilir yazilmaz, daha run etmeden
            javanin riskli kodlari tanimlayip
            calistirmadan once bana bir yol gostermelisin dedigi
            exception turleridir.

            Checked Exceptions genelde dosya okuma ve yazma IO islemlerinde olusur

            IO exception olusma ihtimaline karsi
            kodu yazar yazmaz Java altini kirmizi cizer

            Checked exception kodun altini kirmizi cizdiginden
            kodumuzun calisir hale gelmesi icin kirmizi cizgiyi kaldirmamiz lazim

            1- try-catch blogu kullanarak
               exception handle edilebilir
               ve javaya exception olustugunda ne yapmasini istedigimiz gosterilebilir

            2- Eger exception'i handle etmek istemiyorsak
               sadece kodumuzun calismasini istiyorsak
               method deklarasyonuna bu exception ihtimalini yazarak
               kodu calisir hale getirebiliriz

               method signature'ina throws keyword'u ile
               beklenen exception turunu yazarsak
               kod calisir duruma gelir
               ANCAK exception olusursa java'ya cozum yolu sunulmadigindan
               kodun calismasi durur
         */

        String dosyaYolu = "src/day36_exceptions/text.txt";

        FileInputStream fis = new FileInputStream(dosyaYolu);


    }
}
