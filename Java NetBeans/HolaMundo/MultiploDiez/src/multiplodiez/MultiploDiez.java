/*
Programa que lee un numero entero y muestra si es multiplo de 10
*/
package multiplodiez;

import javax.swing.*;

/**
 *
 * @author Alex
 */
public class MultiploDiez {
    
    public static void main(String[] args) {
        // TODO code application logic here
    
        int num;
        num=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
            
        if(num%10==0){
        JOptionPane.showConfirmDialog(null, " El numero "+num+" es multiplo de diez");
        }else{
                    JOptionPane.showConfirmDialog(null, " El numero "+num+" no es multiplo de diez");
        }
        
    }
    
}
