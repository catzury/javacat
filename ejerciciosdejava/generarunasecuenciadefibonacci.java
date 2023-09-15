import java.util.Scanner;
public class generarunasecuenciadefibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de términos de la secuencia de Fibonacci: ");
        int n = sc.nextInt();
        sc.close();
        int t1 = 0, t2 = 1;
        System.out.print("Secuencia de Fibonacci de " + n + " términos: ");
        for (int i = 1; i <= n; ++i) {
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}

    

