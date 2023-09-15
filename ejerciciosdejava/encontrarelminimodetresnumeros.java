import java.util.Scanner;

public class encontrarelminimodetresnumeros{
    public static void main(String[]args) {
     
    try (Scanner numero = new Scanner(System.in)) {
        int n1,n2,n3;

        System.out.println("primer numero");
        n1 = numero.nextInt();
        System.out.println("segundo onumero");
        n2 = numero.nextInt();
        System.out.println("tercer numero");
        n3 = numero.nextInt();

        if (n1 == n2 && n2 == n3) {
            System.out.println("los tres numeros son iguales");
        } else if (n1 < n2 && n1 <n3){
            System.out.println("El numero menor es:" +n1);
        }else if (n2 <n1 && n2 < n3){
            System.out.println("El numero menor es: " +n2);
        }else {
            System.out.println("El numero menor es:" +n3);
        }
    }

        }
    }
        

        
