/*
Programa que segun el numero de horas las transforma a semanas, dias y horas.
*/
package horassemanas;

import java.util.*;

/**
 *
 * @author Alex
 */
public class HorasSemanas {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada=new Scanner(System.in);
        int horasTotales, sem,dia,hora;
        
        System.out.println("Digite el numero de horas");
        horasTotales=entrada.nextInt();
        
        sem=horasTotales/168;
        dia=horasTotales%168/24;
        hora=horasTotales%24;
        
        System.out.println("El equivalente es:");
        System.out.println("Semanas: "+sem);
        System.out.println("Dias: "+dia);
        System.out.println("Horas: "+hora);
        
    }
    
}
