import java.util.Scanner;
public class caolculasiunanoesbisiestoono {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un año: ");
        int anio = sc.nextInt();
        sc.close();
        boolean esBisiesto = false;
        if (anio % 4 == 0) {
            if (anio % 100 == 0) {
                if (anio % 400 == 0) {
                    esBisiesto = true;
                }
            } else {
                esBisiesto = true;
            }
        }
        if (esBisiesto) {
            System.out.println(anio + " es un año bisiesto.");
        } else {
            System.out.println(anio + " no es un año bisiesto.");
        }
    }
}


