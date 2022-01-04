/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Main {
    
    public static int indiceCocheMbarato(Vehiculo coches[]){
        float precio;
        int indice=0;
        
        precio=coches[0].getPrecio();
        
        for(int i=0;i<coches.length;i++){
            if(coches[i].getPrecio()<precio){
                precio=coches[i].getPrecio();
                indice=i;
            }
        }
        return indice;
    }
    
    public static void main(String[] args) {
      
        Scanner entrada=new Scanner(System.in);
        String marca, modelo;
        float precio;
        int numVehiculos, indiceBarato;
        
        System.out.println("Digite la cantidad de Vehiculos: ");
        numVehiculos=entrada.nextInt();
     
        
        // creamos los objetos para los coches
        Vehiculo coches[]=new Vehiculo[numVehiculos];
        
        for(int i=0;i<coches.length;i++){
            entrada.nextLine();
            System.out.println("Digite las caracteristicas del Coche "+(i+1)+":");
            System.out.println("Introduce Marca: ");
            marca=entrada.nextLine();
            System.out.println("Introudce Modelo: ");
            modelo=entrada.nextLine();
            System.out.println("Introduce Precio: ");
            precio=entrada.nextFloat();
            
            
            coches[i]=new Vehiculo(marca,modelo,precio);
            
        }
        
        
        indiceBarato=indiceCocheMbarato(coches);
        System.out.println("El coche mas barato es: ");
        System.out.println(coches[indiceBarato].mostrarDatos());
    }
    
    
}
