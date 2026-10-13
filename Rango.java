/*
Nombre del programa: Rango.java
Autor: Cristhian saul santiago bazan
*/
import java.util.Scanner;

public class Rango{
    public static void main(String args[]){
       double n; 
     Scanner in =new Scanner(System.in);
     System.out.printf("ingrese un numero en [500-1000]\n");
     n=in.nextDouble();
     if(n>=500 && n<=1000){
     System.out.printf("%.2f esta en el rango",n); 
        
     }else{
     System.out.printf("%.2f no esta en el rango",n);
     
        



     } 
     in.close();
    }
}
