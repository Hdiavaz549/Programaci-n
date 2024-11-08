
package Ejercicios;

import java.util.Scanner;
public class Ejercicio21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dias;
        int mes = sc.nextInt();
        
         dias = switch (mes){
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> 28;
            default -> 0;
         };
        System.out.println("Este mes tiene: " + mes );
        
    }
    
}
