/*
Nombre del programa: Hora.java
Autor: Cristhian saul santiago bazan
Grupo:302-B
*/
import java.util.Scanner;

public class Hora {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int h, m, s;

        System.out.print("Ingrese la hora (HH MM SS): ");
        h = in.nextInt();
        m = in.nextInt();
        s = in.nextInt();

        s = s + 1;

        if (s == 60) {
            s = 0;
            m = m + 1;
        }

        if (m == 60) {
            m = 0;
            h = h + 1;
        }

        if (h == 24) {
            h = 0;
        }

        System.out.printf("La hora un segundo despues es: %02d:%02d:%02d", h, m, s);
    }
}