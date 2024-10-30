
package Ejercicios;

import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double num;
        System.out.println("Escriba un nuemro para redondearlo: ");
        num = sc.nextDouble();
        System.out.println("El resultado es: " + (Math.round(num)));
    }
}
