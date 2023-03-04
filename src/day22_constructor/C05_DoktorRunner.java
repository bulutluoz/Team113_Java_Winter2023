package day22_constructor;

public class C05_DoktorRunner {
    public static void main(String[] args) {

        C04_Doktor doktor1 = new C04_Doktor();
        doktor1.isim= "Kemal";
        doktor1.yas=40;

        System.out.println(doktor1.soyisim); // S atanmamis
        System.out.println(doktor1.yas); // 40

        
        C04_Doktor doktor2 = new C04_Doktor();
        

        C04_Doktor doktor3 ;

        // System.out.println(doktor3.yas);
        // Constructor calismadan bir obje olusturulup deger atanmasi mumkun degildir

        System.out.println("variable'a atanmayan obje icin yas "+ new C04_Doktor().yas);

    }
}
