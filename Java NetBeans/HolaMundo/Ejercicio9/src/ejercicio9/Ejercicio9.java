/*
 Pedir el dia, mes y año de 1 fecha e indicar si la fecha es correcta
Los meses seran de 30 dias
*/
package ejercicio9;

import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
        int dia,mes,agno;
        
        dia=Integer.parseInt(JOptionPane.showInputDialog("Dime el dia"));
        mes=Integer.parseInt(JOptionPane.showInputDialog("Dime el mes"));
        agno=Integer.parseInt(JOptionPane.showInputDialog("Dime el año"));

        if((dia>=1) && (dia<=30)){// si el dia es correcto
            if((mes>=1) && (mes<=12)){// si el mes es correcto
                if(agno!=0){// si el año es correcto
                    JOptionPane.showInputDialog("Fecha correcta");
                }else{                
                    JOptionPane.showInputDialog("Fecha incorrecta, "
                            + "año incorrecto");            
                }
            }else{      
                JOptionPane.showInputDialog("Fecha incorrecta, mes incorrecto");
            }
        }else{
            JOptionPane.showInputDialog("Fecha incorrecta, dia incorrecto");
        }
        
    }
    
}
