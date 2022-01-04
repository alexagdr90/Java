/*
Programa que calcula el salario semanal segun las horas trabajadas
40 o menos = 16
Mas de 40 = 16 por las primeras 40 y 20 por cada hora extra
*/
package ejercicio5;
import javax.swing.*;
/**
 *
 * @author Alex
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        // TODO code application logic here

        int horasTrabajadas;
        float salarioTotal;
        
        horasTrabajadas=Integer.parseInt(JOptionPane.showInputDialog("Digite "
                + "el numero de horas trabajadas"));
        
        if(horasTrabajadas<=40){
            salarioTotal=horasTrabajadas*16;
        }else{
            salarioTotal=(40*16)+((horasTrabajadas-40)*20);
        }

        JOptionPane.showConfirmDialog(null, "El salario es: "+salarioTotal);
        
    }
    
}
