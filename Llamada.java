
/*
Nombre del programa:Llamada.java
Autor: Cristhian saul santiago bazan
*/
import java.util.Scanner;

public class Llamada {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int minutos;
        double resultado;

        System.out.println("Ingrese los minutos de la llamada: ");
        minutos = in.nextInt();

        if (minutos <= 3) {
            resultado = 10;
        } else {
            resultado = 10 + (minutos - 3) * 2;
        }

        System.out.println("El total a pagar es: $" + resultado);
    }
}
    

