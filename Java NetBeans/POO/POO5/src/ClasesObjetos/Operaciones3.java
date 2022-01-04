/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesObjetos;

/**
 *
 * @author Alex
 */
public class Operaciones3 {
    // atributos
    
    // metodos
    
    
    public int suma(int num1, int num2){
       int suma=num1+num2;
       return suma;
    }
    
    
    public int resta(int num1, int num2){
       int resta=num1-num2;
       return resta;
    }

    public int mul(int num1, int num2){
        int mul=num1*num2;
        return mul;
    }

    public int div(int num1, int num2){
        int div=num1/num2;
        return div;
    }  
    
    public void mostrarResultados(int suma, int resta, int mul, int div){
        System.out.println("La suma es "+suma);
        System.out.println("La resta es"+resta);
        System.out.println("La multiplicacion es "+mul);
        System.out.println("La division es "+div);      
    }
    
    
    
}
