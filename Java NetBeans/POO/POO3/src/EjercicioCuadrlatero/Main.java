/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioCuadrlatero;

import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class Main {
    public static void main(String[] args) {
        
        Cuadrilatero c1;
        float lado1, lado2;
        
        lado1=Float.parseFloat(JOptionPane.showInputDialog("Digite el lado1: "));
        lado2=Float.parseFloat(JOptionPane.showInputDialog("Digite el lado2: "));
    
        if(lado1==lado2){// es cuadrad0
            c1=new Cuadrilatero(lado1);
        }else{
            c1=new Cuadrilatero(lado1, lado2);
        }
        
        System.out.println("El perimetro es: "+c1.getPerimetro());
        System.out.println("El area es: "+c1.getArea());
    }
    
   
}
