package day32_inheritance_dataTypeKullanimi;

public class HAvciKuslar extends GKuslar{

    public void hareket(){
        System.out.println("ucarlar");
    }

    public void beslenme(){
        System.out.println("et yerler");
    }

    public void pence(){
        System.out.println("pencelidir");
    }

    public void gaga(){
        System.out.println("sivri gagali");
    }

    public static void main(String[] args) {

        HAvciKuslar kartalAvci= new HAvciKuslar();
        kartalAvci.hareket(); // H ucarlar
        kartalAvci.beslenme();// H et yerler
        kartalAvci.pence();// H pencelidir
        kartalAvci.gaga();// H Sivri gagali

        kartalAvci.kanat(); // G Kanatlidir
        kartalAvci.solunum();// G akciger
        kartalAvci.cogalma();// G yumurta

        kartalAvci.omur();// F Yasar ve olurler


        GKuslar kuslar = new GKuslar();
        kuslar.hareket(); // F hareket ederler
        kuslar.beslenme();// F beslenirler
        // kuslar.pence();// CTE
        kuslar.gaga();// G gagalari vardir

        kuslar.kanat(); // G Kanatlidir
        kuslar.solunum();// G akciger
        kuslar.cogalma();// G yumurta

        kuslar.omur();// F Yasar ve olurler


        GKuslar kartalKus= new HAvciKuslar();

        kartalKus.hareket(); // H ucarlar
        kartalKus.beslenme();// H et yerler
        //kartalKus.pence();// H pencelidir
        kartalKus.gaga();// H Sivri gagali

        kartalKus.kanat(); // G Kanatlidir
        kartalKus.solunum();// G akciger
        kartalKus.cogalma();// G yumurta

        kartalKus.omur();// F Yasar ve olurler


        FHayvanlar hayvanlar = new FHayvanlar();
        hayvanlar.hareket(); // F hareket ederler
        hayvanlar.beslenme();// F beslenirler
        //hayvanlar.pence();// CTE
        //hayvanlar.gaga();// CTE

        //hayvanlar.kanat(); // CTE
        hayvanlar.solunum();// F solunum yaparlar
        hayvanlar.cogalma();// F Cogalirlar

        hayvanlar.omur();// F Yasar ve olurler

        FHayvanlar kartalHayvani = new HAvciKuslar();
        kartalHayvani.hareket(); // H ucarlar
        kartalHayvani.beslenme();// H et yerler
        // kartalHayvani.pence();// CTE
        // kartalHayvani.gaga();// CTE

        // kartalHayvani.kanat(); // CTE
        kartalHayvani.solunum();// G akciger
        kartalHayvani.cogalma();// G yumurta

        kartalHayvani.omur();// F Yasar ve olurler

        /*
            Ozellikler method olarak olusturulmus ise

            data turu ve constructor AYNI ise
            o class'da aramaya baslarim
            buldugum ilk degeri kullanirim

            data turu ve constructor farkli ise

            data turu olan class'dan aramaya baslar

            o class veya parent class'larinda
            bulamazsa CTE verir

            o class veya parent class'larinda
            bulursa, override edilmis mi kontrol eder
            ve en guncel bilgiyi bulup yazdirir

         */

    }


}
