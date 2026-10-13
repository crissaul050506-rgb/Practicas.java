/*
Nombre del programa: Calificacion.java
Autor: Cristhian saul santiago bazan
Grupo:302-B
*/
import java.util.Scanner;

public class Calificacion {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double calificacion;

        System.out.print("Ingrese la calificacion [0,100]: ");
        calificacion = in.nextDouble();

        if (calificacion >= 90) {
            System.out.println("A");
        } else if (calificacion >= 80) {
            System.out.println("B");
        } else if (calificacion >= 70) {
            System.out.println("C");
        } else if (calificacion >= 69) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}