/*
Diseñar un programa para trabaja con triangulos isosceles
*/
package paquete1;

import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class TrianguloIsosceles {
    private double base;
    private double lado;

    public TrianguloIsosceles(double base, double lado) {
        this.base = base;
        this.lado = lado;
    }
    
    public double obtenerPerimetro(){
        double perimetro=2*lado+base;
        return perimetro;
    }
    
    
    public double obtenerArea(){
        double area=(base*Math.sqrt(lado*lado)-((base*base)/4))/2;
        return area;
    }
    
    private String mostrarDatos(){
        return "Baes: "+base+"\nLado"+lado+"\nPerimetro: "+obtenerPerimetro()
                +"\nArea"+obtenerArea();
    }
    
}