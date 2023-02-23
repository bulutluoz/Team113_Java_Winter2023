package day16_scope_arrays;

public class C01_Hastane {

    public static void main(String[] args) {

        ADoktor dok1= new ADoktor();
        System.out.println(dok1.askerlikYaptiMi); // false
        dok1.isim= "Kemal";
        dok1.soyisim ="Yilmaz";
        dok1.dogumYili=1980;

        System.out.println(dok1.isim); // Kemal


        ADoktor dok2= new ADoktor();
        System.out.println(dok2.isim); // null
        dok2.soyisim="Celik";
        System.out.println(dok2.soyisim); // Celik

        System.out.println(dok1);

    }
}
