import java.util.Scanner;

public class OperacionesMat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer número (A)");
        int A = sc.nextInt();

        System.out.println("Ingrese el segundo número (B)");
        int B = sc.nextInt();

        int suma = A+B;
        int resta = A-B;
        double multiplicacion = A*B;
        double division = (double) A/B;
        double potencia = Math.pow(A,B);

        System.out.println("La suma es: " + suma);
        System.out.println("La resta es: "+ resta);
        System.out.println("La multiplicación es: "+ multiplicacion);
        System.out.println("La división es:"+ division);
        System.out.println("La potencia de A elevada a B es: "+ potencia);
    }
}
