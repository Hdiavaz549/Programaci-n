
package Ejercicios;

import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[]  args){
        int a;
        int b;
        int mayor;
        Scanner sc = new Scanner (System.in);
        System.out.println("Escribe primer numero");
        a = sc.nextInt();
        System.out.println("Escribe segundo numero");
        b = sc.nextInt();
        mayor = a >= b? a : b;
        System.out.println(mayor);    
    }
    
}
