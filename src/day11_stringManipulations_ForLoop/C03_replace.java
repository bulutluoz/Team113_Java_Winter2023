package day11_stringManipulations_ForLoop;

public class C03_replace {

    public static void main(String[] args) {

        String str = "Java Candir";

        System.out.println(str.replace('J', 'H')); // Hava Candir

        System.out.println(str.replace("a", "")); // Jv Cndir

        System.out.println(str.replace("Java","X")); // X Candir

        System.out.println(str.replace("v","yayaya")); // Jayayayaa Candir

        str.replace("va","lala"); // yapilan degisiklik bu satir icindir
                                                    // yazdirilmadigi icin gormeyiz
                                                    // atama yapilmadigi icin de kalici olmaz

        // str'daki space'leri yok edin
        str= str.replace(" ","");

        System.out.println(str); // JavaCandir


        System.out.println(str.replaceFirst("a", "")); // JvaCandir
        System.out.println(str.replaceFirst("C", "K")); // JavaKandir


    }
}
