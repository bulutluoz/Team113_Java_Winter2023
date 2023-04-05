package day43_Collections;

import java.util.HashSet;
import java.util.Set;

public class C03_HashSetMethodlari {
    public static void main(String[] args) {
        Set<String>  set1=new HashSet<>();
        set1.add("Kadir");
        set1.add("Yusuf");
        set1.add("Süleyman");
        set1.add("Emre");
        set1.add("Duygu");
        set1.add(null);

        System.out.println(set1);//[null, Duygu, Süleyman, Yusuf, Kadir, Emre]

        set1.add("Emre");
        System.out.println(set1);

    }

}
