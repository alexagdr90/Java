/*
Leer un numero y mostrar su cuadrado, repetir hasta que el numero sea negativo.
*/
package cuadradonumero;

import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class CuadradoNumero {

    public static void main(String[] args) {
        // TODO code application logic here
        
        int num,cua;
        num=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

        while(num>= 0){// mientras num sea 0 o positivo
            cua=(int)Math.pow(num, 2);
            
            JOptionPane.showMessageDialog(null, "El numero "+num+" elevado al "
                    + "cuadrado es "+cua);
            
        num=Integer.parseInt(JOptionPane.showInputDialog("Digite otro numero"));

        }
        
    }
    
}
