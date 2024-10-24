
package Ejercicios;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){
        float media;
        int nota1;
        int nota2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte la primera nota: ");
        nota1 = sc.nextInt();
        System.out.println("Inserte la segunda nota: ");
        nota2 = sc.nextInt();
        media = (nota1 + nota2)/ 2f;
        System.out.println("La nota media es: " + media);
        
        
    }
    
}
