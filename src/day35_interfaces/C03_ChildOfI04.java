package day35_interfaces;

public class C03_ChildOfI04 implements I04_InterfaceIstisnalar{


    @Override
    public void toplama() {

    }


    public static void main(String[] args) {

        C03_ChildOfI04 obj = new C03_ChildOfI04();
        obj.ekIsler(); // Default keyword ile body'si olan method olusturulabilir

        I04_InterfaceIstisnalar.aciklama(); // Bu method'u implement etmek mecburi degil
    }
}
