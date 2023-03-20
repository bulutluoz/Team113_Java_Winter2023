package day33_pollymorphism;

import java.util.Locale;
import java.util.Scanner;

public class asd {
    //  Kullanıcıdan bir kelime alın ve bu kelimenin içerisindeki harf sayılarını başına
    //  yazarak ekrana döndürün.(büyük küçük harfler göz ardı edilecek)
    //  Merhaba 1m1e1r1h2a1b
    //  Seni seviyorum 2s2e1n2i1v1y1o1r1u1m

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir kelime girin: ");
        String kelime = input.nextLine().toLowerCase();

        int flag=1;
        String sonuc="";

        int[] harfSayilari = new int[26];
        for (int i = 0; i < kelime.length(); i++) {
            char harf = kelime.charAt(i);
            if (harf >= 'a' && harf <= 'z') {
                int index = harf - 'a';
                harfSayilari[index]++;
            }
        }

        for (int i = 0; i < harfSayilari.length; i++) {
            if (harfSayilari[i] > 0) {
                char harf = (char) (i + 'a');
                System.out.print(harfSayilari[i] + "" +harf );
            }
        }

    }
}
