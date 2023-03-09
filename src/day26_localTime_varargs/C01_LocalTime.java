package day26_localTime_varargs;

import java.time.LocalTime;

public class C01_LocalTime {
    public static void main(String[] args) {

        LocalTime saat1 = LocalTime.of(14,15);
        System.out.println(saat1); //  14:15

        LocalTime saat = LocalTime.now();
        System.out.println(saat); // 18:52:55.322996

        // LocalTime objesi olan saat variable'i canli bir saat degildir
        // olusturuldugu andaki local time'i sistemden alip kaydettigimiz sabit bir degerdir
        // kodun ilerleyen kisminda ne kadar sure gectigini gormek icin
        // saati yeniden almamiz gerekirse, yeni bir LocalTime objesi daha olusturmaliyiz

        System.out.println(saat.getHour()); // 18
        // get method'lari localTime objesinin saat, dakika, saniye ve nano degerlerini bize getirir

        System.out.println(saat.plusHours(2).plusMinutes(10));

        System.out.println(saat.minusMinutes(10).minusSeconds(10));

        System.out.println(saat.withSecond(10).withNano(20));

        System.out.println(saat.compareTo(saat1)); // ayni ise 0 doner

        System.out.println(saat.isAfter(saat1)); // true
        System.out.println(saat.isBefore(saat1)); // false

        System.out.println(saat.toSecondOfDay()); // 69077

    }
}
