package day31_inheritance;

public class DCorolla extends CToyota{

    String str3="Corolla";

    DCorolla(){
        System.out.println("Parametresiz Corolla constructor'i calisti");
    }

    DCorolla(int sayi){
        System.out.println("int Parametreli Corolla constructor'i calisti");
    }

    public static void main(String[] args) {

        DCorolla obj1 = new DCorolla(5);
    }
}
