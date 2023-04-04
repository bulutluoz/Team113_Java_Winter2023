package day42_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class C01_Queue {
    public static void main(String[] args) {

        Queue<String> harfler=new LinkedList<>();

        harfler.add("A");
        harfler.add("B");
        harfler.add("C");
        harfler.add("A");

        System.out.println(harfler);

        //2.indexe D ekleyelim
        //Queue özelliğinden dolayı her zaman sadece sona ekler


        System.out.println(harfler.remove());
        System.out.println(harfler);
        harfler.remove();
        System.out.println(harfler);
        harfler.add("K");
        harfler.add("L");

        System.out.println(harfler.element());
        System.out.println(harfler);
        System.out.println(harfler.peek());
        System.out.println(harfler);

        Queue<String> karakterler =new LinkedList<>();

        System.out.println(karakterler.peek()); //null
        // System.out.println(karakterler.element()); //exception NoSuchElementException

        System.out.println(harfler.poll());
        System.out.println(harfler);
        System.out.println(karakterler.poll()); //[A, K, L]

        System.out.println(karakterler.offer("*"));
        System.out.println(karakterler); //[*]

    }

}
