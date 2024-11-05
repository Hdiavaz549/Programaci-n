
package Ejercicios;

public class Ejercicio13 {
    public static void main(String[] args){
        System.out.println("La primera expresión es: "
                + (10 + 5 * 2 > 20 && 4 == 4));
        System.out.println("La segunda expresión es: "
                + (!(7 + 3 > 10 || 3 * 2 <= 6)));
        System.out.println("La tercera expresión es: "
                + (10 / 2 + 3 * 5 == 19 && true));
        System.out.println("La cuarta expresión es: "
                + (boolean b = false : b = !b || 7 % 2 == 1));
    
    }
}