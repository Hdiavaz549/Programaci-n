
package Ejercicios;

import java.util.Scanner;
public class Ejercicio18 {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
        double num;
        
        System.out.println("Escribe un numero");
        num = sc.nextDouble();
        
        if (num > 0) {
        System.out.println(num + "  es casi-cero");
        } else {
            System.out.println(num + " no es casi-cero");
        }
    }
    
}
