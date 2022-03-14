import java.util.Scanner;
public class Taxi {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mesafeyi kilometre Cinsinden giriniz:");
            double kilometre = scanner.nextDouble();
                System.out.println("Kilometre başı tutarı giriniz: ");
                    double kmBasıTutar = scanner.nextDouble();
                     System.out.println("Taksimetre Açılış ücretini giriniz:");
                     double acılısTutarı = scanner.nextDouble();
                     double toplamTutar = kilometre * kmBasıTutar + acılısTutarı;

        System.out.println("Toplam tutar:" + toplamTutar);



    }
}
