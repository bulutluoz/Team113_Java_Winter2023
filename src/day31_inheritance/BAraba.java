package day31_inheritance;

public class BAraba {

    protected String str1= "Araba";

    protected BAraba(){

        System.out.println("Araba parametresiz constructor calisti");
    }

    protected BAraba(String str){

        System.out.println("Araba str parametreli constructor calisti");
    }

    protected BAraba(int a, int b){

        System.out.println("Araba 2 int parametreli constructor calisti");
    }
}
