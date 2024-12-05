
import java.util.Random;
import java.util.Scanner;

public class Soal2No3 {

    public static void perkalian(int nom_1, int nom_2) {
        Scanner in = new Scanner(System.in);
        int hasil = nom_1 * nom_2;
        System.out.println("Berapa hasil perkalian dari " + nom_1 + " x " + nom_2 + " adalah =  " );
        int jawab = in.nextInt();
        if (jawab == hasil ) {
            System.out.println("SELAMAT JAWABAN ANDA BENAR :D !!!");
        }else {
            System.out.println("JAWABAN ANDA SALAH :( \n Jawaban yang benar adalah = " + hasil);
        }
    }

    
    public static void pembagian(int nom_1, int nom_2) {
        Scanner in = new Scanner(System.in);
        int hasil = nom_1 / nom_2;
        System.out.println("Berapa hasil dari " + nom_1 + " / " + nom_2 + " adalah = ");
        int jawab = in.nextInt();
        in.nextLine();
        if (jawab == hasil ){
            System.out.println("SELAMAT JAWABAN ANDA BENAAARR :D");
        }else{
            System.out.println("JAWABAN ANDA SALAH :(\n Jawaban yang benar adalah = " + hasil);
        }
    }

    
    public static void modulus(int nom_1, int nom_2) {
        Scanner in = new Scanner(System.in);
        int hasil = nom_1 % nom_2;
        System.out.println("Berapa hasil dari " + nom_1 + " % " + nom_2 + " adalah = ");
        int jawab = in.nextInt();
        in.nextLine();
        if (jawab == hasil ){
            System.out.println("SELAMAT JAWABAN ANDA BENAAARR");
        }else{
            System.out.println("JAWABAN ANDA SALAH :(\n Jawaban yang benar adalah = " + hasil);
        }

    }

    public static String bertanya(){
        Scanner in = new Scanner(System.in);
        System.out.println("Apakah anda ingin melanjutkan? ");
        return in.nextLine();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random masuk = new Random();
        String lanjut;

        do{
            int nom_1 = masuk.nextInt(10);
            int nom_2 = masuk.nextInt(10);

            System.out.println("Pilih operasi \n 1.perkalian \n 2.pembagian \n 3.modulus");
            int pilih = in.nextInt();

            switch (pilih) {
                    case 1:
                    perkalian(nom_1, nom_2);
                    break;

                    case 2:
                    pembagian(nom_1, nom_2);
                    break;

                    case 3 :
                    modulus(nom_1, nom_2);
                    break;
                default:
                    
            }
            lanjut = bertanya();
        }while(lanjut.equalsIgnoreCase("ya")); {
            System.out.println("Terima kasih telah bermain ><");
}
}
}