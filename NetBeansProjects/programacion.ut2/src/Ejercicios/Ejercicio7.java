
package Ejercicios;

import java.util.Scanner;
        
public class Ejercicio7 {
    int edad;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        int edad = sc.nextInt();
        boolean esMayorDeEdad = edad >= 18;
        System.out.println("edad: " + (edad >= 18 ));
    }
}
