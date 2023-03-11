package day27_stringBuilder;

public class C02_MetniTerseCevirme {

    public static void main(String[] args) {

        // Verilen bir metni tersine cevirin

        String str= "Java Candir.";

        StringBuilder sb = new StringBuilder(str);

        System.out.println(sb.reverse());

        sb.reverse();

        System.out.println(sb);

    }
}
