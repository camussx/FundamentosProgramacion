import java.util.Scanner;

public class Comparar_Switch {
    public static void main(String[] args) {
        int numA;
        int numB;
        int diferencia;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer número (A)");
        numA = sc.nextInt();

        System.out.println("Ingrese el primer número (B)");
        numB = sc.nextInt();

        diferencia = Integer.compare(numA, numB);
        //System.out.println(numA % numB);
        switch (diferencia){
            case 1:
                System.out.println("A es mayor que B");
                break;
            case -1:
                System.out.println("A es menor que B");
                break;
            case 0:
                System.out.println("A es igual a B");
                break;
            default:
                System.out.println("Error comparando");
                break;
        }

    }
}
