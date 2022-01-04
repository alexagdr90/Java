/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesObjetos;

/**
 *
 * @author Alex
 */
public class Coche {
    // atributos
    String color;
    String marca;
    int km;
    
    public static void main(String[] args) {
        Coche coche1=new Coche();
        
        coche1.color="Blanco";
        coche1.marca="Audi";
        coche1.km=0;
        
        System.out.println("El color del coche1 es "+coche1.color);
        System.out.println("La marcca del coche1 es "+coche1.marca);
        System.out.println("Los km que tiene el coche1 son "+coche1.km);
    
        System.out.println("");
        
        Coche coche2=new Coche();
        
        coche2.color="Rojo";
        coche2.marca="BMW";
        coche2.km=1000;
        
                
        System.out.println("El color del coche2 es "+coche2.color);
        System.out.println("La marcca del coche2 es "+coche2.marca);
        System.out.println("Los km que tiene el coche2 son "+coche2.km);

    }
}
