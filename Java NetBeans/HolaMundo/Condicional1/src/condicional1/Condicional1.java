/*
Programa con el condicional if.
*/
package condicional1;

import javax.swing.*;

/**
 *
 * @author Alex
 */
public class Condicional1 {

    public static void main(String[] args) {
        // TODO code application logic here
    
        int num, dato=5;
        num=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        
        if(num==dato){
            JOptionPane.showConfirmDialog(null, "El numero es 5");
        }else{
            JOptionPane.showConfirmDialog(null, "El numero es distinto de 5");            
        }
        
    }
    
}
