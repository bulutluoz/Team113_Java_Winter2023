package day35_interfaces;

import java.util.ArrayList;
import java.util.List;

public class C02_ChildOfI01veI03 implements I01_Interface,I03_Interface{
    /*
        Interface'in EN ONEMLI ARTISI
        bir class'in birden fazla interface'i implement edebilmesidir
        biir class'i extends ile de baska class'a chil yapabiliriz

        Ancak birden fazla interface'i implement ederken
        dikkat etmemiz gereken bir konu vardir

        eger implement etmek istedigimiz farkli interface'lerde
        ayni isimde fakat farkli return type'i olan method'lar varsa
        iki method'u ayni anda implement edemeyecegimiz icin
        o iki interface'den ancak birini implement edebiliriz
     */

    @Override
    public void toplama() {

    }

    @Override
    public void cikarma() {

    }

    @Override
    public String ekleme() {
        return null;
    }

    @Override
    public int faktoryel() {
        return 0;
    }

    @Override
    public void bolme() {

    }

    public static void main(String[] args) {
        C02_ChildOfI01veI03 obj = new C02_ChildOfI01veI03();



        System.out.println(I01_Interface.str);
        System.out.println(I03_Interface.str);

        System.out.println(I02_Interface.str);

        List<String> harfler= new ArrayList<>();

    }


}
