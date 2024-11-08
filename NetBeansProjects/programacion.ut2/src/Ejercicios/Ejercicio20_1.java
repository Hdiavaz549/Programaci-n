
package Ejercicios;

import java.util.Scanner;
public class Ejercicio20_1 {
    public static void main(String[] args){
    int nota;
    Scanner sc = new Scanner(System.in);
    System.out.println("Escribe tu nota ");
    nota = sc.nextInt();
    String notaExamen = switch (nota) {
        case 0, 1, 2, 3, 4 -> "Insuficiente";
        case 5 -> "Suficiente";
        case 6 -> "Bien";
        case 7, 8 -> "Notable";
        case 9, 10 -> "Sobresaliente";
        default -> "Error";
    };
    System.out.println("La nota es: " + notaExamen);
    }
}
