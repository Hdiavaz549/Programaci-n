
package Ejercicios;

import java.util.Scanner;
public class Ejercicio16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.println("Escribe un numero");
        num = sc.nextInt();
        
        if (num % 2 == 0){
            System.out.println(num + " es par");
        } else {
            System.out.println(num + " es impar");
    }
    }
}
