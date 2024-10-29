
package Ejercicios;

import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args){
        
        Scanner sc = new Scanner (System.in);
        final float PrecioManzana = 2.35f;
        final float PrecioPera = 1.95f;
        float total;
        float kgManzanasSemestre1;
        float kgPerasSemestre1;
        float kgManzanasSemestre2;
        float kgPerasSemestre2;
        System.out.println("Cuanto kilos de manzanas vende en 1 semestre?");
        kgManzanasSemestre1 = sc.nextFloat();
        System.out.println("Cuanto kilos de peras vende en 1 semestre?");
        kgPerasSemestre1 = sc.nextFloat();
        System.out.println("Cuanto kilos de manzanas vende en 2 semestre?");
        kgManzanasSemestre2 = sc.nextFloat();
        System.out.println("Cuanto kilos de peras vende en 2 semestre?");
        kgPerasSemestre2 = sc.nextFloat();
        
        total = PrecioManzana * kgManzanasSemestre1 + PrecioManzana * kgManzanasSemestre2;
        total += PrecioPera * kgPerasSemestre1 + PrecioPera * kgPerasSemestre2;
       System.out.println(total);
    }
    
}
