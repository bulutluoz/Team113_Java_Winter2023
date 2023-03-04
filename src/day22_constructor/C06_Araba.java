package day22_constructor;

import java.security.PublicKey;

public class C06_Araba {
    /*
        Bir obje olusturulurken
        default constructor veya parametresiz gorunur constructor kullanilirsa
        obje ilk atanan degerlere sahip olur
        istedigimiz degerleri atamak icin tek tek tum variable'lara
        atama yapmamiz gerekir

        Bunun yerine

        atamak istedigimiz degerleri parametre olarak
        constructor'a yollayalim
        ve atamalari constructor icinde yapalim


     */

    public C06_Araba(String mrk, String mdl, boolean hmi,int yl,int fyt){

        yil = yl;
        marka=mrk;
        model=mdl;
        hasarliMi=hmi;
        fiyat=fyt;

    }

    public C06_Araba(){

    }


    @Override
    public String toString() {
        return "Araba Ozellikleri{" +
                "yil=" + yil +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", hasarliMi=" + hasarliMi +
                ", fiyat=" + fiyat +
                '}';
    }

    int yil;
    String marka="Marka belirtilmemis";
    String model="Model belirtilmemis";
    boolean hasarliMi;
    int fiyat;

    public void yakitTuketimi(String yakitTuru){

        switch (yakitTuru){
            case "Benzin" :
                System.out.println("benzinli araclar icin yakit tuketimi: 6 l/100 km");
                break;
            case "dizel" :
                System.out.println("Dizel araclar icin yakit tuketimi: 5 l/100 km");
                break;
            case "Elektrik" :
                System.out.println("Elektrikli araclar icin yakit tuketimi: 5 kW/100 km");
                break;
            default:
                System.out.println("gecersiz yakit turu");
        }
    }
}
