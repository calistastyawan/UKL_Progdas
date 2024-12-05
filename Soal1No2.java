import java.util.Scanner;

public class Soal1No2 { 
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.println("Menentukan bilangan ganjil atau genap");
        System.out.println("Masukkan bilangan");
        int bilangan = in.nextInt();
 
        if(bilangan % 2 == 0) {
            System.out.println(bilangan +"Bilangan genap");
        } else {
            System.out.println(bilangan +"Bilangan ganjil");
        }

        in.close();

    }
}
 