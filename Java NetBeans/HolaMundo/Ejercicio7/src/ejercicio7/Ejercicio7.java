/*
Pedir 3 numeros y ordenarlos de mayor a menor
*/
package ejercicio7;
import javax.swing.*;
/**
 *
 * @author Alex
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        // TODO code application logic here

        int n1,n2,n3;

        n1=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        n2=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        n3=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));

        if((n1>n2) && (n2>n3)){
            JOptionPane.showConfirmDialog(null, "Orden: "+n1+"-"+n2+"-"+n3);
        }else if((n1>n3) && (n3>n2)){
            JOptionPane.showConfirmDialog(null, "Orden: "+n1+"-"+n3+"-"+n2);
        }else if((n2>n1) && (n1>n3)){
            JOptionPane.showConfirmDialog(null, "Orden: "+n2+"-"+n1+"-"+n3);
        }
        else if((n2>n3) && (n3>n1)){
            JOptionPane.showConfirmDialog(null, "Orden: "+n2+"-"+n3+"-"+n1);
        }
        else if((n3>n1) && (n1>n2)){
            JOptionPane.showConfirmDialog(null, "Orden: "+n3+"-"+n1+"-"+n2);
        }else{
            JOptionPane.showConfirmDialog(null, "Orden: "+n3+"-"+n2+"-"+n1);            
        }
    }
    
}
