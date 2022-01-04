/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class Calculadora {

    public static void main(String[] args) {
    // TODO code application logic here
    
        int num1, num2, sum, res, mul, div;
        char operacion;
        
        num1=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        num2=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        operacion=JOptionPane.showInputDialog("Digite la operacion s, r, m "
                + "o d ").charAt(0);

        switch(operacion){
            case 's': sum = num1+num2;
                JOptionPane.showInputDialog("La suma es:"+sum);
            case 'r': res = num1-num2;
                JOptionPane.showInputDialog("La resta es:"+res);
            case 'm': mul = num1*num2;
                JOptionPane.showInputDialog("La multiplicacion es:"+mul);
            case 'd': div = num1/num2;
                JOptionPane.showInputDialog("La division es:"+div);             
            default:
                JOptionPane.showInputDialog("La operacion es incorrecta");
        }
        
        
    }
    
}
