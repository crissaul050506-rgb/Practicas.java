
/*
Nombre del programa:Rango_mod.java
Autor: Cristhian saul santiago Bazan
Grupo: 302-B
*/
import java.util.*;

public class Rango_mod {

    public static void main(String args[]) {

        int n1;

        Scanner in = new Scanner(System.in);

        System.out.println("Introduce un entero en [500,1000]: ");
        n1 = in.nextInt();

        if (n1 >= 500 && n1 <= 1000) {
            System.out.println(n1 + " está en el intervalo [500,1000]");
        } else {
            System.out.println(n1 + " NO está en el intervalo [500,1000]");
        }

       
        if ((n1 % 2 == 0) || (n1 % 3 == 0)) {
            System.out.println(n1 + " es divisible entre 2 o entre 3");
        } else {
            System.out.println(n1 + " no es divisible entre 2 ni 3");
        }

     
        if (!(n1 == 0)) {
            System.out.println("La condición (!(n1==0)) es verdadera");
        } else {
            System.out.println("La condición (!(n1==0)) es falsa");
        }

    
        if (false && (n1 / 0 > 1)) {
            System.out.println("Se cumplen las dos condiciones");
        }else{
            System.out.println("Con &&, la segunda condición no se evalúa");
        }

        if(true || (n1 / 0 > 1)){
            System.out.println("Con ||, la segunda condición no se evalúa");
        }else{
            System.out.println("No se cumple ninguna condición");
        }
    }
}