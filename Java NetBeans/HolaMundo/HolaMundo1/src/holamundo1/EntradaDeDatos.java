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
public class EntradaDeDatos {
    public static void main(String[] args) {
        
        Scanner entrada=new Scanner(System.in);
        int numero;
        Scanner entrada2=new Scanner(System.in);        
        double numero2;
        Scanner entrada3=new Scanner(System.in);        
        String cadena;
        Scanner entrada4=new Scanner(System.in);        
        char letra;
        
        System.out.println("Dime un numero ");
        numero=entrada.nextInt();
        System.out.println("Dime un numero double ");//5,8956
        numero2=entrada2.nextDouble();
        System.out.println("Dime una cadena ");
        cadena=entrada3.nextLine();
        System.out.println("Dime un caracter: ");
        letra=entrada4.next().charAt(0);
        
        System.out.println("El numero es: "+numero);
        System.out.println("El numero es: "+numero2);
        System.out.println("La cadena es: "+cadena);
        System.out.println("El caracter es: "+letra);

    }
}
