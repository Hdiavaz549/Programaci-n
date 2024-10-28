package Ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main (String[] args){
        System.out.println("Especifique su edad");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        x++;
        System.out.println("El año que viene tendras: "+ x ++);
}
}
