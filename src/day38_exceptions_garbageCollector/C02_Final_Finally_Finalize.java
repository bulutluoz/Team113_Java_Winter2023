package day38_exceptions_garbageCollector;

public class C02_Final_Finally_Finalize {

    public static void main(String[] args) {

        System.out.println(Integer.MIN_VALUE); // -2147483648

        // Integer.MIN_VALUE = 3; Constant Data

        System.out.println(Math.PI); // 3.141592653589793


        try {

            System.out.println( 10 / 0 );
            System.out.println("bolmenin sonrasindaki satir");

        } catch (Exception e) {

            System.out.println("catch blogundaki satir");

        } finally {

            System.out.println("finalyy blogundaki satir");

        }

    }
}
