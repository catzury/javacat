import java.util.Scanner;

public class verificasielnumeroespositivonegativoocero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        double num = sc.nextDouble();
        sc.close();
        if (num > 0) {
            System.out.println(num + " es positivo");
        } else if (num < 0) {
            System.out.println(num + " es negativo");
        } else {
            System.out.println(num + " es cero");
        }
    }
}
