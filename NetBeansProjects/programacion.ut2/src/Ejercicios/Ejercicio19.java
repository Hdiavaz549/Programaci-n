
package Ejercicios;

import java.util.Scanner;
public class Ejercicio19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        
        System.out.println("Escriba el primer numero: ");
        num1 = sc.nextInt();
        
        System.out.println("Escribe el segundo numero: ");
        num2 = sc.nextInt();
        
        System.out.println("Escribe el tercer numero: ");
        num3 = sc.nextInt();
        
        if(num1 > num2 && num1 > num3){
            System.out.println(num1 + " es mayor que " + num2 + " y " + num3);
        } else if(num1 > num3 && num1 > num2){
            System.out.println(num1 + " es mayor que " + num3 + " y " + num2);
        } else if(num2 > num1 && num2 > num3){
            System.out.println(num2 + " es mayor que " + num1 + " y " + num3);
        } else if(num2 > num3 && num2 > num1){
            System.out.println(num2 + " es mayor que " + num3 + " y " + num1);
        } else if(num3 > num1 && num3 > num2){
            System.out.println(num3 + " es mayor que " + num1 + " y " + num2);
        } else if(num3 > num2 && num3 > num1){
            System.out.println(num3 + " es mayor que " + num2 + " y " + num1);
        }
    }
    
}
