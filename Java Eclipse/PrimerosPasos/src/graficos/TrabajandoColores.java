/**
 * 
 */
package graficos;
import java.awt.*;
import java.awt.geom.*;
import java.awt.geom.Ellipse2D.Double;

import javax.swing.*;
/**
 * @author Alex
 *
 */
public class TrabajandoColores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MarcoConColor mimarco=new MarcoConColor();
		mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mimarco.setVisible(true);
		
	}

}

class MarcoConColor extends JFrame{
	
	public MarcoConColor() {
		
		setTitle("Prueba con colores");
		setSize(400,400);
		LaminaConColor milamina=new LaminaConColor();
		add(milamina);
		milamina.setBackground(Color.PINK);
//		milamina.setBackground(SystemColor.window);// ventana por defecto de cada sistema operativo
	
	}
	
	
}

class LaminaConColor extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		Graphics2D g2=(Graphics2D) g;
		// dibujo rectangulo
		
		Rectangle2D rectangulo=new Rectangle2D.Double(100,100,200,150);

		g2.setPaint(Color.RED);
		
		g2.fill(rectangulo);
		
		//dibujo elipse
		Double elipse=new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		g2.setPaint(new Color(0,140,255).brighter());
		g2.fill(elipse);
	}
	
}






