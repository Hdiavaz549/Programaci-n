
package Ejercicios;

import java.util.Scanner;
public class Ejercicio24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una edad: ");
        int edad = sc.nextInt();
        int max = edad;
        int min = edad;
        
        while (edad != -1)  {
            if (max < edad) {
                max = edad;
            }
            if (min > edad) {
                min = edad;
            }
            System.out.println("Escribe otra edad: ");
            edad = sc.nextInt();
            
        }
            
    }
}
