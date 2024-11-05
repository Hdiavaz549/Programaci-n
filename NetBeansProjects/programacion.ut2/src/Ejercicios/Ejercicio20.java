
package Ejercicios;

import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {
        int nota;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu nota: ");
        nota = sc.nextInt();
        switch (nota) {
            case 0, 1, 2, 3, 4:
                System.out.println(nota + "Insuficiente");
                break;

            case 5:
                System.out.println(nota + "Suficiente");
                break;

            case 6:
                System.out.println(nota + "Bien");
                break;

            case 7, 8:
                System.out.println(nota + "Notable");
                break;

            case 9, 10:
                System.out.println("Sobresaliente");
                break;
            
            default: 
                System.out.println("Error");
        }
    }

}
