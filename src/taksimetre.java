import java.util.Scanner;

public class taksimetre {
    public static void main(String[] args) {

        double km;
        double perKm = 2.20, total = 10;


        Scanner input = new Scanner(System.in);
        System.out.print("Km Giriniz:");
        km = input.nextDouble();

        total += (km * perKm);
        total = (total < 20) ? 20: total;
        System.out.println("Odenecek tutar:" + total);



    }
}
