
package ventana;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Alex
 */
public class Ventana extends JFrame{

    public Ventana(){
        this.setSize(500,500);// establecemos tamaño
        setTitle("Titulo de la ventana");
        //setLocation(200, 200);
        //setBounds(200, 200, 500, 500);
        setLocationRelativeTo(null);
        
        setMinimumSize(new Dimension(200,200));
        
        //this.getContentPane().setBackground(Color.BLUE);
        
        iniciarComponetes();
        
        setDefaultCloseOperation(EXIT_ON_CLOSE); // CERRAMOS EL PROGRAMA
        
    }
    
    private void iniciarComponetes(){
        
        JPanel panel=new JPanel();// creacion de un panel
        panel.setLayout(null);// desactivando Layout
        //panel.setBackground(Color.GREEN);// DAMOS COLOR AL PANEL
        this.getContentPane().add(panel);// agregamos el panel a la ventana
        //JLabel etiqueta=new JLabel("Hola");// creamos una etiqueta
        JLabel etiqueta=new JLabel("Mundial 2022",SwingConstants.CENTER);// creamos una etiqueta
        //etiqueta.setText("Hola");
        etiqueta.setBounds(85, 10, 300, 80);  
        etiqueta.setForeground(Color.BLUE);// color de la letra
        etiqueta.setOpaque(true);
        etiqueta.setBackground(Color.BLACK);// color de la caja
        etiqueta.setFont(new Font("arial",Font.PLAIN,40)); // tipo de fuente de la letra
        panel.add(etiqueta);// agregamos la etiqueta

        
        
    }   
    
    
    
}
