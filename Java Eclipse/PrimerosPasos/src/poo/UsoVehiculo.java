/**
 * 
 */
package poo;
//import javax.swing.*;
/**
 * @author Alex
 *
 */
public class UsoVehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Coche2 mi_coche2=new Coche2();
		
		//mi_coche2.establece_color();
		mi_coche2.establece_color(JOptionPane.showInputDialog("Introduce el color del coche:"));
		//mi_coche2.color="Rosa";
		
		System.out.println(mi_coche2.dime_datos_generale());
		System.out.println(mi_coche2.dime_color());
		
		mi_coche2.configura_asientos(JOptionPane.showInputDialog("�Tiene asientos de cuero?"));
		System.out.println(mi_coche2.dime_asientos());
		
		mi_coche2.configura_climatizador(JOptionPane.showInputDialog("�Tiene climatizador?"));
		System.out.println(mi_coche2.dime_climatizador());
		
		System.out.println(mi_coche2.dime_peso_coche());

		System.out.println("El precio final del coche es "+ mi_coche2.dime_precio_coche()+" Euros");
*/

		Coche2 miCoche1=new Coche2();
		miCoche1.establece_color("Rojo");
		Furgoneta miFurgoneta1=new Furgoneta(7, 580);
		miFurgoneta1.establece_color("Azul");
		miFurgoneta1.configura_asientos("si");
		miFurgoneta1.configura_climatizador("si");

		System.out.println(miCoche1.dime_datos_generale()+" "+ miCoche1.dime_color());
		System.out.println(miFurgoneta1.dime_datos_generale()+" "+ miFurgoneta1.dimeDatosFurgoneta());
	}

}
