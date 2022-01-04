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
  
    private static  double mayorArea(TrianguloIsosceles triangulos[]){
        double area;
        
        area=triangulos[0].obtenerArea();
        for (int i = 0; i < triangulos.length; i++) {
            if (triangulos[i].obtenerArea()>area) {
                area=triangulos[i].obtenerArea();
            }
        }
        
        return area;
    }
    
    public static void main(String[] args) {
  
        Scanner entrada=new Scanner(System.in);
        double base, lado;
        int nTriangulos;
    
        System.out.println("Digite el numero de triangulos a ingresar");
        nTriangulos=entrada.nextInt();
    
        TrianguloIsosceles triangulos[]=new TrianguloIsosceles[nTriangulos];
        for (int i = 0; i < triangulos.length; i++) {
            System.out.println("Digite los valores para el triangulo "+(i+1)+":");
            System.out.println("Introduce la base: ");
            base=entrada.nextDouble();
            lado=entrada.nextDouble();
        
            triangulos[i]=new TrianguloIsosceles(base,lado);
            
            System.out.println("El perimetro del triangulo es: "+triangulos[i].obtenerPerimetro());
            System.out.println("El area del triangulo es "+triangulos[i].obtenerArea());
        }
    
        System.out.println("El area del triangulo de mayor superficie es: "+mayorArea(triangulos));
    
    }

}
