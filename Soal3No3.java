import java.util.Scanner;

public class Soal3No3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Masukkan jumlah array: ");
        int jumlahArray = scanner.nextInt();
        int[] array = new int[jumlahArray];

        System.out.println("================ Masukkan data Array ==============");
        for (int i = 0; i < jumlahArray; i++) {
            System.out.println("data ke-"+ (i + 1) + ":");
            array[i] = scanner.nextInt();
        }

        for (int i = 0; i < jumlahArray; i++) {
            int jumlah = 1;
            boolean sudahDihitung = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    sudahDihitung = true;
                    break;
                }
            }

            if (sudahDihitung) {
                for (int j = i + 1; j < jumlahArray; j++) {
                    if (array[i] == array[j]) {
                        jumlah++;
                    }
                }
                
                System.out.println(array[i] + " terdapat "+ jumlah + "kali");
            }
        }

        scanner.close();
    }
}
