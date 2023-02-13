package day08_nestedIfElse_ternary;

public class C08_Ternary {
    public static void main(String[] args) {

        // Soru 3- Kullanicidan bir harf isteyin,
        //         girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        //         yoksa girilen harfi yazdirin


        char harf = '7';

        System.out.println(harf>='a' && harf<='z'
                            ? Character.toUpperCase(harf)
                            : harf);
    }
}
