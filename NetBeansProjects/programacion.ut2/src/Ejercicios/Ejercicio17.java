
package Ejercicios;

import java.util.Scanner;
public class Ejercicio17 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num1, num2;
        
        System.out.println("Escribe un numero: ");
                num1 = sc.nextInt();
                
        System.out.println("Escribe otro numero: ");
                num2 = sc.nextInt();
                
        if (num1 > num2){
            System.out.println(num1 + " es mayor que " + num2);
        } else {
            System.out.println(num2 + " es mayor que " + num1);
        }
    }
}
