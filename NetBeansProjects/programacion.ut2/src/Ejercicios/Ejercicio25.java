
package Ejercicios;

import java.util.Scanner;
import java.util.Random;

public class Ejercicio25 {
    public static void main(String[] args) {
        
        int numAciertos = 0;
        int sumaUsuario;
        int suma1;
        int suma2;
        do {
            suma1 = (int) (Math.random() * 100);
            suma2 = (int) (Math.random() * 100);
            
            System.out.println("Escribe el resultado de: " + suma1 + " + " + suma2);
            Scanner sc = new Scanner(System.in);
            sumaUsuario = sc.nextInt();
            numAciertos++;
        } while (suma1 + suma2 == sumaUsuario);
        System.out.println("Nº aciertos: " + numAciertos);
                
        
        }
}
