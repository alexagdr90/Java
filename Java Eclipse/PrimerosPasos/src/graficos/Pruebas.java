/**
 * 
 */
package graficos;

import java.awt.*;
import javax.swing.*;
/**
 * @author Alex
 *
 */
public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fuente=JOptionPane.showInputDialog("Introduce fuente");
		boolean estalafuebte=false;
		
		
		String[] nombresDeFuentes=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		
		
		for(String nombredelafuente: nombresDeFuentes) {
//			System.out.println(nombredelafuente);		
			
			boolean estalafuente=false;
			
			if(nombredelafuente.equals(fuente)) {
				estalafuente=true;
			}
			
			if(estalafuente) {
				System.out.println("Fuente instalada");
			}else {
				System.out.println("No esta instalada");
			}
		
		}
		
	}

}
