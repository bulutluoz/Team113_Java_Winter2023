package day27_stringBuilder;

public class C04_StringBuilderdeStringMethodlari {

    public static void main(String[] args) {

        /*
            StringBuilder Class'inda olmayip,
            String Class'inda olan method'lari kullanmak istersek
            sb.toString() kullanarak, StringBuilder'i once String'e cevirir
            sonra istedigimiz String method'larini kullaniriz

            Bu konuda DIKKAT etmemiz gereken konu
            String donduren method'lar
            veya String Class'indan kullanacagimiz method'lar
            kalici degisiklik YAPMAZ
         */

        StringBuilder sb1= new StringBuilder("Java Candir");
        StringBuilder sb2 = new StringBuilder("Java candir");

        sb1.substring(5);

        System.out.println(sb1); // Java Candir

        // sb1 = sb1.substring(5);

        System.out.println(sb1.compareTo(sb2)); // -32

        System.out.println(sb1.toString().equalsIgnoreCase(sb2.toString())); // true

        sb1.subSequence(3,6);

        System.out.println(sb1); // Java Candir



    }
}
