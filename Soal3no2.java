import java.util.Scanner;

public class Soal3no2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);


        System.out.println("Tentukan jumlah array");
        int jumlah = scanner.nextInt();
        int[] array = new int[jumlah];

        System.out.println("Masukkan data array");
        for (int i = 0; i <jumlah; i++) {
            System.out.println("data ke-"+ (i + 1)+ " : ");
            array[i]= scanner.nextInt();
    }

         System.out.println("Array: }");
         for (int i = 0; i <jumlah; i++){
            System.out.println(array[i]);
            if (i < jumlah - 1){
                System.out.println(",");

            }
         }
         System.out.println("}");

         boolean adaDuplikat = false;
         System.out.println("_____________________________________");
         for (int i = 0; i < jumlah; i++) {
            for (int j = i + 1; j < jumlah; j++) {
                if(array[i] == array[j]) {
                    System.out.println("Array memiliki elemen duplikat:" + array[i]);
                    adaDuplikat = true;
                    break;
                }
            }
            }

            if (!adaDuplikat) { 
             System.out.println("Array tidak memiliki elemen duplikat.");
         }

         scanner.close();
         
        }

    

         }