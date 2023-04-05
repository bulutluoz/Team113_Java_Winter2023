package day43_Collections;

import java.util.*;

public class C02_MixSet {
    public static void main(String[] args) {
        Set<Object> mixSet=new HashSet<>();

        mixSet.add(12);
        mixSet.add("Java");
        mixSet.add('S');
        mixSet.add(true);

        int [] arr=new int[3];
        arr[2]=34;
        arr[1]=71;

        mixSet.add(arr);

        List<Object> mixList=new ArrayList<>();
        mixList.add("Hava");
        mixList.add(24);

        mixSet.add(mixList);

        System.out.println(mixList);//[Hava, 24]
        System.out.println(mixSet); //[Java, [Hava, 24], [I@3f3afe78, S, 12, true]
        // Collections objeleri birararda tutan yapılardır.

        System.out.println(mixSet.size()); //6
        System.out.println(mixSet.contains(24));//false
        System.out.println(mixSet.contains(12));//true
        System.out.println(Arrays.toString(arr));//[0, 71, 34]

        // Data türü olark object seçilirse içine her data türünden element konulabilir
        // Ancak elementlere ulaşmamız ya da update etmek gibi işlemleri yapmamız
        // mümkün olmayabilir ya da çok zor olabilir

    }
}
