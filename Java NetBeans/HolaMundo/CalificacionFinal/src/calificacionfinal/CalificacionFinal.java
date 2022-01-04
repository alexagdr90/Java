/*
Sbiendo que las calificaciones de semestre, primerExamen, segundoExamen y 
examenFinal tienen unas ponderaciones de 10%,25%,25% y 40%, Hacer un progama
que calcule e imprima la notaFinal.
*/
package calificacionfinal;

import java.util.*;

/**
 *
 * @author Alex
 */
public class CalificacionFinal {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
    float semestre, primerExamen, segundoExamen, examenFinal, notaFinal;
        System.out.println("Dime la nota del semestre");
        semestre=entrada.nextFloat();
        System.out.println("Dime la nota del Primer Examen");
        primerExamen=entrada.nextFloat();
        System.out.println("Dime la entrada del Segundo Examen");
        segundoExamen=entrada.nextFloat();
        System.out.println("Dime la entrada del Examen Final");
        examenFinal=entrada.nextFloat();
        
        semestre*=0.10f;
        primerExamen*=0.25f;
        segundoExamen*=0.25f;
        examenFinal*=0.40f;
        
        notaFinal=semestre+primerExamen+segundoExamen+examenFinal;
        System.out.println("La nota final es de "+notaFinal);
    
    }
    
    
}
