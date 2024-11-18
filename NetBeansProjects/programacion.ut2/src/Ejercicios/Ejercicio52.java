
package Ejercicios;


public class Ejercicio52 {
    public static void main(String[] args){
        int n = 2;
        if (esPrimo(n))
            System.out.println("El número " + n + "es primo");
        else
            System.out.println("El numero " + n + " no es primo");
    }
    static boolean esPrimo(int n) {
    boolean esPrimo = true;
    int i = 2;
    if(n<2) {
        esPrimo = false;
    }
    
    while (i < n && esPrimo){
        if (n % i == 0){
        esPrimo = false;
    }
    i++;
    }
return esPrimo;
}
}
