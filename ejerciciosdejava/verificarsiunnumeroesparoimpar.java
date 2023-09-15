import java.util.Scanner;

public class verificarsiunnumeroesparoimpar {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingresa un número entero: ");
            int num = sc.nextInt();
            if (num % 2 == 0) {
                System.out.println(num + " es un número par.");
            } else {
                System.out.println(num + " es un número impar.");
            }
        }
    }
}
