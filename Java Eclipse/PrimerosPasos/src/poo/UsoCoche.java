/**
 * 
 */
package poo;

/**
 * @author Alex
 *
 */
public class UsoCoche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coche Renault=new Coche();// instanciar coche, ejemplar de clase
		//Renault.ruedas=3;
		
		//System.out.println("Este coche tiene: "+Renault.ruedas+" ruedas.");
		System.out.println("Este coche tiene "+Renault.largo+" cm de largo.");
		System.out.println(Renault.dime_ruedas());
		
		Renault.largo=2200;
		System.out.println("Ahora este coche tiene "+Renault.largo+" cm de largo.");

	}

}
