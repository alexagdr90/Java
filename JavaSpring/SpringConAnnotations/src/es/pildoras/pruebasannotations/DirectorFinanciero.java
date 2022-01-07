/**
 * 
 */
package es.pildoras.pruebasannotations;

import org.springframework.beans.factory.annotation.Value;

/**
 * @author Alex
 *
 */
public class DirectorFinanciero implements Empleados {

	
	
	
	
	public directorFinanciero(CreacionInformeFinanciero informeFinanciero) {
		this.informeFinanciero = informeFinanciero;
	}
	
	
	
	

	public String getEmail() {
		return email;
	}





	public String getNombreEmpresa() {
		return nombreEmpresa;
	}





	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestion y direccion de las operaciones financieras en la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return informeFinanciero.getInformeFinanciero();
	}
	
	
	private CreacionInformeFinanciero informeFinanciero;

	@Value("${email}")
	private String email;
	@Value("${nombreEmpresa}")
	private String nombreEmpresa;
	
	

}
