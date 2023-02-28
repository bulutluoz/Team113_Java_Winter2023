package day18_multiDimensionalArrays;

public class C07_MDA {

    public static void main(String[] args) {


        int[][] arr = {{13,25,37},{41,12,23,34},{11,25},{17}};

        // 20 ile 40 arasinda olan sayilarin(20 ve 40 dahil) toplamini bulun

        int istenenElementlerinToplami=0;

        for (int i = 0; i < arr.length ; i++) { // outer array icin

            for (int j = 0; j <arr[i].length ; j++) { // inner array'ler icin

                if (arr[i][j]>=20 && arr[i][j]<=40){

                    istenenElementlerinToplami += arr[i][j];
                }

            }


        }

        System.out.println("Istenen elementlerin toplami : " + istenenElementlerinToplami);
    }
}
