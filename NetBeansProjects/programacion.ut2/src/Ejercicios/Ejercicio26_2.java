package Ejercicios;

import java.util.Scanner;
public class Ejercicio26_2 {
    public static void main(String[] arags){
        Scanner sc = new Scanner(System.in);
        int a;
        
            System.out.println("Introduce un numero: ");
            a = sc.nextInt();
        for (int i = a; i > 0; i--) {
            System.out.println("Eco");
        }
    }
}
