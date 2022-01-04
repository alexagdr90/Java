import java.util.*;
/**
 * 
 */

/**
 * @author Alex
 *
 */
public class UsoTallas {

	//enum Talla{MINI,MEDIANO,GRANDE,MUY_GRANDE};
	
	enum talla{
		
		MINI("s"), MEDIANO("m"), GRANDE("G"), MUY_GRANDE("xl");
		
		private talla(String abreviatura) {
			this.abreviatura=abreviatura;
		}
		
		public String getAbreviatura() {
			return abreviatura;
		}

		private String abreviatura;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String talla;
		talla="Pequeña";
		talla="Mediana";
		talla="Grande";
		talla="Azul";//NO TIENE QUE VER*/
		
		//enum
		/*Talla s=Talla.MINI;
		Talla m=Talla.MEDIANO;
		Talla l=Talla.GRANDE;
		Talla xl=Talla.MUY_GRANDE;
		//Talla xxl=Talla.ENORME;*/
		
		Scanner entrada=new Scanner(System.in);
		
		System.out.println("Escribe una talla: MINI, MEDIANO, GRANDE O MUY_GRANDE");
		String entrada_datos= entrada.next().toUpperCase();
		
		talla la_talla=Enum.valueOf(talla.class, entrada_datos);
		
		System.out.println("Talla= "+la_talla);
		System.out.println("Abreviatura= "+la_talla.getAbreviatura());
	}

}




