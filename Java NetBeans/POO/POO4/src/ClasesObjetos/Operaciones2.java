/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesObjetos;

/**
 *
 * @author Alex
 */
public class Operaciones2 {
         // atributos
    int suma, resta, mul, div;
    
    // metodos
    
    
    public void suma(int num1, int num2){
        suma=num1+num2;
    }
    
    
    public void resta(int num1, int num2){
        resta=num1-num2;
    }

    public void mul(int num1, int num2){
        mul=num1*num2;
    }

    public void div(int num1, int num2){
        div=num1/num2;
    }  
    
    public void mostrarResultados(){
        System.out.println("La suma es "+suma);
        System.out.println("La resta es"+resta);
        System.out.println("La multiplicacion es "+mul);
        System.out.println("La division es "+div);      
    }
    
}
