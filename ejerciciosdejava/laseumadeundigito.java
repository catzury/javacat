import java.util.Scanner;
public class laseumadeundigito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int num = sc.nextInt();
        sc.close();
        int suma = 0;
        while (num != 0) {
            suma += num % 10;
            num /= 10;
        }
        System.out.println("La suma de los dígitos es: " + suma);
    }
}


