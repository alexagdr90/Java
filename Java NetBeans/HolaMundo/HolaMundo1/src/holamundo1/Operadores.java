/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holamundo1;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Operadores {
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        float numero1, numero2, suma, resta, multiplicacion, division, resto;
        
        System.out.println("Digite dos numeros: ");
        numero1=entrada.nextFloat();
        numero2=entrada.nextFloat();

        suma=numero1+numero2;
        resta=numero1+numero2;
        multiplicacion=numero1*numero2;
        division=numero1/numero2;
        resto=numero1%numero2;
      
        System.out.println("Suma: "+suma);
        System.out.println("Resta: "+resta);
        System.out.println("Multiplicacion: "+multiplicacion);
        System.out.println("Division: "+division);
        System.out.println("Resto: "+resto);


    }
}
