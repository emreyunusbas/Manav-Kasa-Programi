import java.util.Scanner;

public class ManavProgrami {
    public static void main(String[] args) {
        double armutKgFiyat = 2.14;
        double elmaKgFiyat = 3.67;
        double domatesKgFiyat = 1.11;
        double muzKgFiyat = 0.95;
        double patlicanKgFiyat = 5.00;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Armut Kaç Kilo? : ");
        double armutKilo = scanner.nextDouble();

        System.out.print("Elma Kaç Kilo? : ");
        double elmaKilo = scanner.nextDouble();

        System.out.print("Domates Kaç Kilo? : ");
        double domatesKilo = scanner.nextDouble();

        System.out.print("Muz Kaç Kilo? : ");
        double muzKilo = scanner.nextDouble();

        System.out.print("Patlıcan Kaç Kilo? : ");
        double patlicanKilo = scanner.nextDouble();

        double toplamTutar = (armutKgFiyat * armutKilo) +
                (elmaKgFiyat * elmaKilo) +
                (domatesKgFiyat * domatesKilo) +
                (muzKgFiyat * muzKilo) +
                (patlicanKgFiyat * patlicanKilo);

        System.out.println("Toplam Tutar: " + toplamTutar + " TL");

        scanner.close();
    }
}
