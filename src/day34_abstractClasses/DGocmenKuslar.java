package day34_abstractClasses;

public class DGocmenKuslar extends BKuslar{
    /*
        Sadece ayirimi belirtmek icin
        abstract olmayan class'lara CONCRETE Class denir

        1- abstract bir class
           parent'i olan abstract class'daki
           abstract method'lari Implement etmek
           ZORUNDA DEGILDIR

           isterse implement edip, concrete hale getirir
           isterse yok sayar

        2- abstract bir silsileden sonra gelen
           ilk concrete class
           parent veya grandParent(s) olan
           abstract class'larda
           concrete yapilmayan tum abstract class'lari
           IMPLEMENT ETMEK ZORUNDADIR
     */

    @Override
    public void hareket() {

    }

    @Override
    public void beslenme() {

    }

    @Override
    public void omur() {

    }
}
