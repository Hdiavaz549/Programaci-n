
package Ejercicios;

import java.util.Scanner;
public class Ejercicio31 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        variosSaludos(suma(2, 3));
        System.out.println(suma (2, 3));
    }
    
    public static void variosSaludos(int n){
        for (int i = 0; i < n; i++){
            System.out.println("Hola");
        }
    }
    
    public static int suma(int x, int y){
        int resultado;
        resultado = x + y;
        return resultado;
    }

}
