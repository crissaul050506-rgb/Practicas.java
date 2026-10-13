/*
Nombre del programa:Marco_mod.java
Autor: Cristhian saul santiago Bazan
Grupo: 302-B
*/
import java.util.Scanner;

public class Marco_mod {
    public static void main(String args[]) {
        int n,i,j;
        String caracter;
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese el tamaño: ");
        n = in.nextInt();

        System.out.print("Ingrese el caracter: ");
        caracter = in.next();

        for (i = 1; i <= n; i++) {
            for ( j = 1; j <= n; j++) {

                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print(caracter);
                } else {
                    System.out.print(" ");
                }s
            }
            System.out.println();
        }
    }
}