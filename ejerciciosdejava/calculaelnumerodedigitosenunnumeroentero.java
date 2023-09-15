import java.util.Scanner;
public class calculaelnumerodedigitosenunnumeroentero {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número entero: ");
        int num = sc.nextInt();
        sc.close();
        int count = 0;
        while (num != 0) {
            num /= 10;
            ++count;
        }
        System.out.println("El número de dígitos es: " + count);
    }
}



