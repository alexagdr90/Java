/**
 * 
 */
package poo;

/**
 * @author Alex
 *
 */
public class Coche {

	private int ruedas;
	int largo;
	int ancho;
	int motor;
	int peso;
	
	public Coche() {
		ruedas=4;
		largo=2000;
		ancho=300;
		motor=1600;
		peso=500;
		
	}
	/*public static void main(String args[]) {
		
		Coche Renault=new Coche();// instanciar coche, ejemplar de clase
		
		System.out.println("Este coche tiene "+Renault.ruedas+" ruedas.");
	}*/
	
	public String dime_ruedas() {
		return("Este coche tiene "+ruedas+" ruedas.");
	}
}
