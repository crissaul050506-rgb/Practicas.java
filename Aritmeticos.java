/*
Nombre del programa: Aritmeticos.java
Autor: Cristhian saul santiago bazan

*/
import java.util.Scanner;

public class Aritmeticos {
   public static void main(String[] args) {

        int n1, n2,a;
        Scanner in = new Scanner(System.in);

        System.out.println("Introduzca dos numeros:");
        n1 = in.nextInt();
        n2 = in.nextInt();

        // Operaciones aritmeticas normales
        System.out.printf("Suma: %d\n", n1 + n2);
        System.out.printf("Resta: %d\n", n1 - n2);
        System.out.printf("Multiplicacion: %d\n", n1 * n2);
        System.out.printf("Division: %d\n", n1 / n2);
        System.out.printf("Residuo: %d\n", n1 % n2);

        // Operadores abreviados
        a = n1;
        a += n2;
        System.out.printf("Suma con +=: %d\n", a);

        a = n1;//para quee "a" vuelva al valor dado
        a -= n2;
        System.out.printf("Resta con -=: %d\n", a);

        a = n1;
        a *= n2;
        System.out.printf("Multiplicacion con *=: %d\n", a);

        a = n1;
        a /= n2;
        System.out.printf("Division con /=: %d\n", a);

        a = n1;
        a %= n2;
        System.out.printf("Residuo con %%=: %d\n", a);//doble porcentaje para que se imprima
        in.close();//cierro el scanner que cree y utilize para leer datos de la entrada estandar que es el teclado
    }
}
