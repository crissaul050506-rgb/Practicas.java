
/*
Nombre del programa: Salario .java
Autor: Cristhian saul santiago bazan
Grupo:302-B
*/
import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String nombre;
        double horas, tarifa, salario, impuesto, neto;
        
        System.out.print("Ingrese el nombre del trabajador: ");
        nombre = in.nextLine();

        System.out.print("Ingrese las horas trabajadas: ");
        horas = in.nextDouble();

        System.out.print("Ingrese la tarifa por hora: ");
        tarifa = in.nextDouble();

        if (horas <= 35) {
            salario = horas * tarifa;
        } else {
            salario = (35 * tarifa) + ((horas - 35) * tarifa * 1.5);
        }

        if (salario <= 1000) {
            impuesto = 0;
        } else if (salario <= 2000) {
            impuesto = (salario - 1000) * 0.10;
        } else {
            impuesto = (1000 * 0.10) + ((salario - 2000) * 0.20);
        }

        neto = salario - impuesto;

        System.out.println("Trabajador: " + nombre);
        System.out.println("Salario bruto: " + salario);
        System.out.println("Impuesto: " + impuesto);
        System.out.println("Salario neto: " + neto);
    }
}