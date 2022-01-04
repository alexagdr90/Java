/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesObjetos;

import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class Main {
    public static void main(String[] args) {
        
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Digite un numero"));
        
        Operaciones3 op=new Operaciones3();
        int suma=op.suma(n1, n2);
        int resta=op.resta(n1, n2);
        int mul=op.mul(n1, n2);
        int div=op.div(n1, n2);
        
        op.mostrarResultados(suma,resta,mul,div);
        
    }
}
