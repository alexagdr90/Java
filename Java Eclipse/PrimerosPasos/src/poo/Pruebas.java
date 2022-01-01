/**
 * 
 */
package poo;

/**
 * @author Alex
 *
 */
public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empleados trabajador1=new Empleados("Alex");
		Empleados trabajador2=new Empleados("Juan");
		Empleados trabajador3=new Empleados("Maria");
		Empleados trabajador4=new Empleados("Paco");

		trabajador1.cambiaSeccion("RRHH");
		//trabajador1.cambiar_nombre("Maria");// sin final en String nombre
		
		/*System.out.println(trabajador1.devuelveDatos());
		//Empleados.Id++;
		System.out.println(trabajador2.devuelveDatos());
		//Empleados.Id++;
		System.out.println(trabajador3.devuelveDatos());
		System.out.println(trabajador4.devuelveDatos());*/

		System.out.println(trabajador1.devuelveDatos()+"\n"+trabajador2.devuelveDatos()+
				"\n"+trabajador3.devuelveDatos()+"\n"+trabajador4.devuelveDatos());
	
		System.out.println(Empleados.dameIdSiguiente());
		
	}

}


class Empleados{
	
	public Empleados(String nom) {
		nombre=nom;
		seccion="Administracion";
		Id=IdSiguiente;
		IdSiguiente++;
	}
	
	public void cambiaSeccion(String seccion) {// setter
		this.seccion=seccion;
	}
	
	/*public void cambiar_nombre(String nombre) {// setter
		this.nombre=nombre;
	}*/
	
	public String devuelveDatos() {// getter
		return "El nombre es "+nombre+", la seccion es "+seccion+" y el Id es "+Id;
	}
	
	public static String dameIdSiguiente() {
		return "El IdSiguiente es: "+IdSiguiente;
	}
	
	private final String nombre;
	private String seccion;
	private int Id;
	private static int IdSiguiente=1;
}






