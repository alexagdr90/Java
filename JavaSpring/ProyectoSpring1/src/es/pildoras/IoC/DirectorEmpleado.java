/**
 * 
 */
package es.pildoras.IoC;

import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;

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
	
	// metodo init, ejecutar tareas antes de que el bean este disponible
	
	public void metodoInicial() {
		System.out.println("Dentro del metodo init. Aqui irian las tareas a ejecutar "+
				"antes de que el bean este listo");
	}
	
	// metodo destroy, ejecutar tareas despues de que el bean haya sido utilizado
	
	public void metodoFinal() {
		System.out.println("Dentro del metodo destroy. Aqui irian las tareas a ejecutar "+
				"despues de utilizar el bean");
	}
	
	
	
	private String email;
	
	private String nombreEmpresa;



	
	
	
}
