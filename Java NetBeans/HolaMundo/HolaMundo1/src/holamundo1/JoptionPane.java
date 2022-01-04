/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holamundo1;

import javax.swing.JOptionPane;

/**
 *
 * @author Alex
 */
public class JoptionPane {
    public static void main(String[] args) {
        
        String cadena;
        int entero;
        char letra;
        double decimal;
        
        cadena=JOptionPane.showInputDialog("Digite una cadena: ");
        entero=Integer.parseInt(JOptionPane.showInputDialog("Digite una entero: "));
        letra=JOptionPane.showInputDialog("Digite una letra: ").charAt(0);
        decimal=Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal: "));

        JOptionPane.showConfirmDialog(null, "La cadena es: "+cadena);
        JOptionPane.showConfirmDialog(null, "El entero es: "+entero);
        JOptionPane.showConfirmDialog(null, "La letra es: "+letra);
        JOptionPane.showConfirmDialog(null, "El decimal es: "+decimal);
        
        
    }
}
