/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
  
   public static void main(String[] args){
        double radio;
   final double PI = 3.141592;
   double longitud;
   double area;
       Scanner sc = new Scanner(System.in);
       System.out.println("Escriba el radio: ");
       radio=sc.nextDouble();
       longitud=2*PI*radio;
       radio=sc.nextDouble();
       area=PI*radio*radio;
       System.out.println("El resultado es: " + longitud + area);
       
       
              
   }
    
    
}
