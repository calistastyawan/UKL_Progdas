public class Soal1No3 {
    public static void main(String[] args) {
        for (int i = 50; i >= 1; i--) {
            System.out.println(i + ".");
            if (i == 1) { 
                System.out.println("Saya Senang!!");
            }else{
                switch (i % 3) {
                    case 0:
                        System.out.println("Saya Angkatan 33");
                        break;

                    case 1:
                        System.out.println("Saya Anak Wikusama");
                        break;

                    case 2:
                        System.out.println("Saya Anak Moklet");
                        break;
                
                }
            }
        }
    }
}
