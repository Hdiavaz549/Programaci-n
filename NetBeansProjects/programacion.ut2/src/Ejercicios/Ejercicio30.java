
package Ejercicios;

import java.util.Scanner;
public class Ejercicio30 {
    public static void main(String[] args){
        int num;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero: ");
        num = sc.nextInt();
        for(int i = 1; i <=num; i++){
            for(int j = 1; j <=i; j++){
                System.out.print("*");
            }
            System.out.println();
    }
    }
    
}
