package day30_inheritance;

public class HChild extends GParent{

    protected int sayiChild;

    HChild(){
        System.out.println("Child class constructor'i calisti");
    }


    public static void main(String[] args) {

        HChild objChild= new HChild();

        System.out.println(objChild.sayiChild);
        System.out.println(objChild.sayiParent);
        System.out.println(objChild.sayiGrandparent);

        /*
            Child class'dan olusturdugumuz bir obje
            parent ve grandParent class'larindaki tum ozelliklere sahip olur

            bir obje olusturuldugunda
            ilk degerleri alabilmesi icin MUTLAKA BIR CONSTRUCTOR calismalidir

            Constructor call bizim cok kullandigimiz bir ozellik degildir
            ancak inheritance'i tam olarak anlayabilmek icin
            constructor call konusunu bilmemiz lazim

            Bu class'dan obje olusturmak icin
            HChild() constructor'ini kullandik
            AMA objemiz parent ve grandparent'daki ozellikleri de sahiplendi

            Peki bu nasil oldu ?

            Her ne kadar objeyi child class'dan olustursak da
            bu objenin parant ve grantParent class'larindaki ozellikleri alabilmesi icin
            o class'larin constructor'lari da calismak ZORUNDADIR

            java bu mecburi calismayi saglayabilmek icin
            cok ozel bir sistem gelistirmistir.

            bunun adi super() : super constructor call'dur.
         */
    }
}
