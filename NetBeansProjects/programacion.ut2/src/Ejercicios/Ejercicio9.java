
package Ejercicios;

import java.awt.BorderLayout;
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args){
       Scanner sc = new Scanner (System.in);
       System.out.println("Esta lloviendo?");
       boolean esLloviendo = sc.nextBoolean();
       
        System.out.println("Has terminado la tarea?");
        boolean esTarea = sc.nextBoolean();
        
        System.out.println("Tienes que ir a la biblioteca?");
        boolean esBiblioteca = sc.nextBoolean();
        
        System.out.println("Puedes salir si" 
        + (esLloviendo==false && esTarea ==true && esBiblioteca==true || esLloviendo && esTarea==false && esBiblioteca==true));
        
        System.out.println("No puedes salir" 
        + (esLloviendo && esTarea && esBiblioteca==false || esLloviendo==true && esTarea==true && esBiblioteca==false));
        
        
        
               
        
    }
    
}
