 import java.util.Scanner;
public class calcularelpromediodeunarreglodenumeros {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el tamaño del arreglo: ");
        int n = sc.nextInt();
        double[] numeros = new double[n];
        double suma = 0.0;
        for (int i = 0; i < n; ++i) {
            System.out.print("Introduce el número " + (i + 1) + ": ");
            numeros[i] = sc.nextDouble();
            suma += numeros[i];
        }
        sc.close();
        double promedio = suma / n;
        System.out.format("El promedio de los números es: %.2f", promedio);
    }
}


