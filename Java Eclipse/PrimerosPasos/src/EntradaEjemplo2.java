import javax.swing.*;
public class EntradaEjemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String Nombre_usuario=JOptionPane.showInputDialog("Introduce tu nombre, porfavor");
		
		String edad=JOptionPane.showInputDialog("Introduce tu edad, porfavor");
		
		int edad_usuario=Integer.parseInt(edad);
		
		System.out.println("Hola "+Nombre_usuario+". El año que viene tendras "+(edad_usuario+1));
		
	}

}
