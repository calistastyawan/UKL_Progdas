import java.util.Scanner;

public class Soal2No2 {

    
    public static double hitungVolumeTabung(double jariJari, double tinggi) {
        final double PI = 3.14; 
        return PI * jariJari * jariJari * tinggi;
    }          

    public static double hitungLuasLingkaran(double jariJari) {
        final double PI = 3.14;
        return PI * jariJari * jariJari;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Masukkan jari-jari tabung (dalam satuan cm): ");
        double jariJari = scanner.nextDouble();
        
        System.out.print("Masukkan tinggi tabung (dalam satuan cm): ");
        double tinggi = scanner.nextDouble();

        double volume = hitungVolumeTabung(jariJari, tinggi);

        System.out.println("Volume tabung dengan jari-jari " + jariJari + " cm dan tinggi " + tinggi + " cm adalah: " + volume + " cm³");

        double luas = hitungLuasLingkaran(jariJari);

        System.out.println("Luas Lingkaran dengan jariJari " + jariJari + " cm adalah : " + luas + " cm " );

        scanner.close();
    }
}

