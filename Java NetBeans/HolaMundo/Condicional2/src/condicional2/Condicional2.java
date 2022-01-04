/*
Programa con la sentencia Switch
*/
package condicional2;

import javax.swing.*;

/**
 *
 * @author Alex
 */
public class Condicional2 {

    public static void main(String[] args) {
        // TODO code application logic here
  
        int dato;
        dato=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero "
                + "entre 1-5"));

        switch(dato){
       
            case 1: JOptionPane.showConfirmDialog(null, " Es el numero 1");
            break;
            case 2: JOptionPane.showConfirmDialog(null, " Es el numero 2");
            break;
            case 3: JOptionPane.showConfirmDialog(null, " Es el numero 3");
            break;
            case 4: JOptionPane.showConfirmDialog(null, " Es el numero 4");
            break;
            case 5: JOptionPane.showConfirmDialog(null, " Es el numero 5");
            break;
            default:  JOptionPane.showConfirmDialog(null, " No esta en el rango"
                    + " 1-5");
       }
        
    
    }
    
}
