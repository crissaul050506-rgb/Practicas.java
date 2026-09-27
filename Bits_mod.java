/*
Nombre del programa:Bits_mod.java
Autor: Cristhian saul santiago Bazan
Grupo: 302-B
*/
import java.util.Scanner;
public class Bits_mod {
    public static void main(String args[]) {
        int op, a, b, res;
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce el valor entero a: ");
        a = in.nextInt();
        System.out.print("Introduce el valor entero b: ");
        b = in.nextInt();
        do {
            System.out.println("\n\t* * MENÚ * *");
            System.out.println("1.- Corrimiento a la izquierda (<<)");
            System.out.println("2.- Corrimiento a la derecha (>>)");
            System.out.println("3.- Corrimiento a la derecha sin signo (>>>)");
            System.out.println("4.- AND a nivel de bits (&)");
            System.out.println("5.- OR a nivel de bits (|)");
            System.out.println("6.- XOR a nivel de bits (^)");
            System.out.println("7.- NOT a nivel de bits (~)");
            System.out.println("8.- Salida");
            System.out.print("\n\tIntroduce tu opción: ");
            op = in.nextInt();
            switch (op) {
                case 1:
                    res = a << b;
                    System.out.println("\n\tResultado (a << b) = " + res);
                    break;
                case 2:
                    res = a >> b;
                    System.out.println("\n\tResultado (a >> b) = " + res);
                    break;
                case 3:
                    res = a >>> b;
                    System.out.println("\n\tResultado (a >>> b) = " + res);
                    break;
                case 4:
                    res = a & b;
                    System.out.println("\n\tResultado (a & b) = " + res);
                    break;
                case 5:
                    res = a | b;
                    System.out.println("\n\tResultado (a | b) = " + res);
                    break;
                case 6:
                    res = a ^ b;
                    System.out.println("\n\tResultado (a ^ b) = " + res);
                    break;
                case 7:
                    System.out.println("\n\tValor de ~a = " + (~a));
                    System.out.println("\tValor de ~b = " + (~b));
                    break;
                case 8:
                    break;
                default:
                    System.out.println("\n\tOpción NO válida");
            }
        } while (op != 8);
    }
}
