package day29_inheritance;

public class C04_Child extends C03_ParentClass{

    int c=20;
    int a;

    String s = "Child class";
    String m;

    public void method1(){
        System.out.println("child class method1");
    }

    public static void main(String[] args) {

        C03_ParentClass objC03 = new C03_ParentClass();
        objC03.a=20;
        objC03.b=22;
        objC03.s="p";
        objC03.t="k";
        objC03.method1(); // Parent Method1 calisti
        objC03.method2(); // Parent Method2 calisti




        C04_Child objC04 = new C04_Child();
        objC04.a=50;
        objC04.c=20;
        objC04.s="u";
        objC04.m="l";
        objC04.method1(); // child class method1

        // C04 class'ini C03'e child yapinca
        // child class'da olmayip, parent class'da olan
        // b, t ve method2 ozellik olarak objC04'e eklendi
        objC04.b=8;
        objC04.t="y";
        objC04.method2();// Parent Method2 calisti



        /*
            Java'da parent class'lar child edinmez
            child class'lar parent edinir

            Bir class'in baska bir class'daki TUM OZELLIKLERI
            otomatik olarak edinmesini istiyorsak
            class'imizi extends keyword ile o class'a child yapariz
            (Size baba diyebilir miyim // sizi parent yaptim)
         */



    }


}
