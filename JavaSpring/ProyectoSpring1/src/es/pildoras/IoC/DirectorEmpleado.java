/**
 * 
 */
package es.pildoras.IoC;

/**
 * @author Alex
 *
 */
public class DirectorEmpleado implements Empleados {

	// creacion  campo tipo CreacionInforme(interfaz)
	private CreacionInformes informeNuevo;
	
	// creacion  de constructor que inyecta la dependencia
	public DirectorEmpleado(CreacionInformes informenuevo) {
		this.informeNuevo=informenuevo;
	}
	
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe creado por el director: "+informeNuevo.getInforme();
	}

	private String email;
	
	private String nombreEmpresa;
	
	

	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getNombreEmpresa() {
		return nombreEmpresa;
	}


	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	
	



	
	
	
}
