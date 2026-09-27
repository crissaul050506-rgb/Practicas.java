/*
Nombre del programa:Calcular_serie.java
Autor: Cristhian saul santiago bazan
*/
import java.util.*;

public class Calcular_serie{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        double x, exp, fac, resultado;
        int n, j,k;

        resultado = 0;

        System.out.print("Ingrese el valor de x: ");
        x = in.nextDouble();

        System.out.print("Ingrese el numero de terminos: ");
        n = in.nextInt();

        for (j = 0; j < n; j++) {

            exp = 1;
            fac = 1;

            for ( k = 1; k <= j; k++) {
                exp = exp * x;
            }

            for ( k = 1; k <= 2 * j; k++) {
                fac = fac * k;
            }

            if (j % 2 == 0) {
                resultado = resultado + exp / fac;
            } else {
                resultado = resultado - exp / fac;
            }
        }

        System.out.println("El resultado de la serie es:  "+ resultado);



    }
}
