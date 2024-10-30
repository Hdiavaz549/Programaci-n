
package Ejercicios;

import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args){
        int num;
        int valorAbsoluto;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        //Calculo usando Math
        //valorAbsoluto = Math.abs(num);
        //Calculo manual
        valorAbsoluto = num > 0 ? num : (-1) * num;
        System.out.println("Valor absoluto: " + valorAbsoluto);
    }
    
}
