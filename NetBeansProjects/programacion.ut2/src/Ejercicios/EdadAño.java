
package Ejercicios;

import java.util.Scanner;

public class EdadAño {
    public static void main(String[] args){
        int edad;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe año actual");
        int x = sc.nextInt();
        System.out.println("Escribe año en que naciste");
        int y = sc.nextInt();
        edad = x - y;
        System.out.println("Tienes: " + edad);
}
}
