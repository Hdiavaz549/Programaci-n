
package Ejercicios;

import java.util.Scanner;
public class Ejercicio22 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = -1;
        while  (a  !=0) {
            System.out.println("Introduce un numero o un 0 se quieres salir: ");
            a = sc.nextInt();
            
            if (a !=0) {
                if (a % 2 == 0) {
                    System.out.println("El numero " + a + " es par");
                } else {
                    System.out.println("El numero " + a + " es impar");
                }
                
                if (a > 0) {
                    System.out.println("El numero " + a + " es positivo");
                } else if (a < 0) {
                    System.out.println("El numero " + a + " es negativo");
                } else {
                    System.out.println("El numero es cero");
                }
                
                int cuadrado = a * a;
                System.out.println("El cuadrado de " + a + " es: " + cuadrado);
                System.out.println("Introduce otro numero o un 0 si quieres salir: ");
                a = sc.nextInt();
            }
            System.out.println("Has salido del programa");
        }        
        
    }
    
}
