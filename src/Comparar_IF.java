import java.util.Scanner;

public class Comparar_IF {
    public static void main(String[] args) {
        int numA;
        int numB;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer número (A)");
        numA = sc.nextInt();

        System.out.println("Ingrese el primer número (B)");
        numB = sc.nextInt();

        if (numA>numB) {
            System.out.println("El número " + numA + " es mayor que " + numB);
        }else if (numA<numB){
            System.out.println("El número " + numA + " es menor que " + numB);
        }else{
            System.out.println("Los números ingresados son iguales");
        }
    }
}
