package day18_multiDimensionalArrays;

public class C06_MDA {

    public static void main(String[] args) {

        int[][] arr = {{3,5,7},{1,2,3,4},{1,2},{7}};

        // array'de kac tane cift sayi oldugunu bulun

        int sayac=0;

        for (int i = 0; i < arr.length ; i++) {

            for (int j = 0; j <arr[i].length ; j++) {

                if (arr[i][j]%2==0){
                    sayac++;
                    System.out.println(arr[i][j]);
                }
            }

        }

        System.out.println("Cift sayi adedi : " + sayac);
    }
}
