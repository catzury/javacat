import java.util.Scanner;

public class elareadeuncirculo {
    public static void main(String[] args) {
        double radio, area;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingresa el radio del círculo: ");
            radio = sc.nextDouble();
        }
        area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del círculo es: " + area);
    }
}
