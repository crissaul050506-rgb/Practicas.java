/*
Nombre del programa:Promedio_mod.java
Autor: Cristhian saul santiago Bazan
Grupo: 302-B
*/
import java.util.*;

public class Promedio_mod{

    public static void main(String args[]) {

        int conta = 0;
        float suma = 0;
        float calif;
        float prom;

        Scanner in = new Scanner(System.in);

        System.out.println("Introduce una calificación (-1 Fin): ");
        calif = in.nextFloat();

        while (calif != -1) {

            conta++;
            suma += calif;

            System.out.println("Introduce una calificación (-1 Fin): ");
            calif = in.nextFloat();
        }

        if (conta != 0) {
            prom = suma / conta;
            System.out.printf("Promedio = %.2f\n", prom);
        } else {
            System.out.println("No se introdujeron calificaciones");
        }
    }
}