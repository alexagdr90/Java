/**
 * 
 */
package graficos;
import java.awt.Frame;

import javax.swing.*;
/**
 * @author Alex
 *
 */
public class CreandoMarcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		miMarco marco1=new miMarco();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// acaba el programa al cerrar ventana
	}

}


class miMarco extends JFrame{
	
	public miMarco() {
		//setSize(500,300);
		//setLocation(500,300);
		setBounds(500,300,550,250);
		//setResizable(false);// no poder modificar la pantalla
		//setExtendedState(Frame.MAXIMIZED_BOTH);// abre pantalla completa
		//setExtendedState(6);// abre pantalla completa igual
		setTitle("Ventana de Alex");
	}
	
}



