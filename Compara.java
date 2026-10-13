/*
Nombre del programa: Compara.java
Autor: Cristhian saul santiago bazan
*/
import java.util.Scanner;

public class Compara {
    public static void main(String args[]) {

        int n1, n2;
        Scanner in = new Scanner(System.in);

        System.out.println("Introduzca dos numeros enteros:");
        n1 = in.nextInt();
        n2 = in.nextInt();

        if (n1 > n2) {
            System.out.printf("%d es mayor a %d\n", n1, n2);
        }

        if (n1 < n2) {
            System.out.printf("%d es menor a %d\n", n1, n2);
        }

        if (n1 >= n2) {
            System.out.printf("%d es mayor o igual a %d\n", n1, n2);
        }

        if (n1 <= n2) {
            System.out.printf("%d es menor o igual a %d\n", n1, n2);
        }

        if (n1 == n2) {
            System.out.printf("%d es igual a %d\n", n1, n2);
        }

        if (n1 != n2) {
            System.out.printf("%d es diferente a %d\n", n1, n2);
        }
      in.close();
    }
}
