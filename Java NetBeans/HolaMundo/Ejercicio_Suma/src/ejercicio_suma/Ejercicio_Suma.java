/*
 * Hacer un programa que calcule e imprima la suma de tres calificaciones. 
*/
package ejercicio_suma;
import java.util.*;
/**
 *
 * @author Alex
 */
public class Ejercicio_Suma {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada=new Scanner(System.in);
        float nota1,nota2,nota3,suma;
        
        System.out.println("Digite tres calificaciones: ");
        nota1=entrada.nextFloat();
        nota2=entrada.nextFloat();
        nota3=entrada.nextFloat();
        
        suma=nota1+nota2+nota3;// suma de las 3 notas
        System.out.println("\n La suma es: "+suma);
        
        
    }
    
}
