/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operaciones;

import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class Operacion {
    // atributos
    int num1, num2;
    int suma, resta, mul, div;
    
    // metodos

    // metodo para pedir 2 numeros

    public void leerNumeros(){
    num1=Integer.parseInt(JOptionPane.showInputDialog("Dime el primer numero"));
    num2=Integer.parseInt(JOptionPane.showInputDialog("Dime "
            + "el segundo numero"));
    }
    
    
    public void suma(){
        suma=num1+num2;
    }
    
    public void resta(){
        resta=num1-num2;
    }

    public void mul(){
        mul=num1*num2;
    }

    public void div(){
        div=num1/num2;
    }  
    
    public void resultado(){
        System.out.println("La suma es "+suma);
        System.out.println("La resta es"+resta);
        System.out.println("La multiplicacion es "+mul);
        System.out.println("La division es "+div);      
    }
    
    
}
