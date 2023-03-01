package day20_arrayLists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_KullaniciyaListeOlusturtmak {

    public static void main(String[] args) {
        // Kullanicidan istedigi kadar isim alip,
        // Q’ya bastiginda girdigi isimleri bize liste olarak dondurecek bir method olusturun.

        System.out.println(kullaniciyaListOlusturtma());
    }


    public static List<String> kullaniciyaListOlusturtma(){

        List<String> isimler = new ArrayList<>();
        String girilenisim="";
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Listeye eklenmek icin bir isim girin" +
                    "\nBitirmek icin Q'ya basin");
            girilenisim = scan.nextLine();

            if (!girilenisim.equalsIgnoreCase("q")){
                isimler.add(girilenisim);
            }

        }while(!girilenisim.equalsIgnoreCase("Q"));

        return isimler;


    }
}
