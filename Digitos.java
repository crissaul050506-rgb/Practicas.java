/*
Nombre del programa: Digitos.java
Autor: Cristhian saul santiago bazan
*/
import java.util.Scanner;

public class Digitos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n, digito;
        System.out.printf("Ingrese un entero mayor que cero: ");
        n = in.nextInt();

        while (n > 0) {
         digito = n % 10;
             switch (digito) {
                case 0:
                    System.out.println("Cero");
                    break;
                case 1:
                    System.out.println("Uno");
                    break;
                case 2:
                    System.out.println("Dos");
                    break;
                case 3:
                    System.out.println("Tres");
                    break;
                case 4:
                    System.out.println("Cuatro");
                    break;
                case 5:
                    System.out.println("Cinco");
                    break;
                case 6:
                    System.out.println("Seis");
                    break;
                case 7:
                    System.out.println("Siete");
                    break;
                case 8:
                    System.out.println("Ocho");
                    break;
                case 9:
                    System.out.println("Nueve");
                    break;
        }
         n = n / 10;
     }
 }
}
