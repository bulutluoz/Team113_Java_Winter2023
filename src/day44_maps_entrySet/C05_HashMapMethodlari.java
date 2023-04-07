package day44_maps_entrySet;

import java.util.Map;
import java.util.TreeMap;

public class C05_HashMapMethodlari {

    public static void main(String[] args) {
        Map<String,Integer> ornekMap= new TreeMap<>();

        ornekMap.put("A",20);
        ornekMap.put("B",15);
        ornekMap.put("K",25);
        ornekMap.put("M",20);
        ornekMap.put("T",30);

        System.out.println(ornekMap); // {A=20, B=15, K=25, M=20, T=30}



        System.out.println(ornekMap.get("K")); // 25
        System.out.println(ornekMap.get("Z")); // null
        // Verilen Key varsa value'sunu dondurur, yoksa null dondurur

        System.out.println(ornekMap.getOrDefault("M", 60)); // 20
        System.out.println(ornekMap.getOrDefault("Z", 60)); // 60
        // verilen key varsa value'sunu getirir, yoksa verilen default degeri dondurur


        System.out.println(ornekMap.replace("M", 50)); // 20
        // Verilen key varsa, degerini update eder ve eski degeri dondurur

        System.out.println(ornekMap); // {A=20, B=15, K=25, M=50, T=30}


        System.out.println(ornekMap.replace("T", 30, 90)); // true
        // Verilen key'in eski value'su verilen deger ise update edip true doner
        // key'in degeri verilen deger degilse bir islem yapmaz ve false dondurur

        System.out.println(ornekMap); // {A=20, B=15, K=25, M=50, T=90}

        System.out.println(ornekMap.replace("B", 30, 90)); // false

        System.out.println(ornekMap); // {A=20, B=15, K=25, M=50, T=90}


    }
}
