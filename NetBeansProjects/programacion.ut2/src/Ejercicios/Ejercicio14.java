
package Ejercicios;

import java.awt.BorderLayout;
import java.util.Scanner;
public class Ejercicio14 {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       int primerTrimestre;
       int segundoTrimestre;
       int tercerTrimestre;
       int notaFinal;
       double notaExpediente;
       double nota;
       System.out.println("Escribe nota final del 1 trimestre: ");
       primerTrimestre = sc.nextInt();
       System.out.println("Escribe nota final del 2 trimestre: ");
       segundoTrimestre = sc.nextInt();
       System.out.println("Escribe nota final del 3 trimestre: ");
       tercerTrimestre = sc.nextInt();
       nota = (float)((primerTrimestre + segundoTrimestre + tercerTrimestre) / 3);
       notaFinal = (int)nota;
       System.out.println("Nota boletin: " + notaFinal );
       notaExpediente = nota;
       System.out.println("Nota Expediente academico " + notaExpediente);
    }
}