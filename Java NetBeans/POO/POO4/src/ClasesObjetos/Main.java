/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesObjetos;
import javax.swing.*;
/**
 *
 * @author Alex
 */
public class Main {
    public static void main(String[] args) {
        
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        
        Operaciones2 op=new Operaciones2();
        op.suma(n1, n2);
        op.resta(n1, n2);
        op.mul(n1, n2);
        op.div(n1, n2);
        
        op.mostrarResultados();
        
    }
}
