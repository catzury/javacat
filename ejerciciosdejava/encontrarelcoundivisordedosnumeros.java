import java.util.Scanner;
public class encontrarelcoundivisordedosnumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();
        sc.close();
        int mcd = 1;
        for (int i = 1; i <= num1 && i <= num2; ++i) {
            if (num1 % i == 0 && num2 % i == 0) {
                mcd = i;
            }
        }
        System.out.println("El máximo común divisor de " + num1 + " y " + num2 + " es: " + mcd);
    }
}


