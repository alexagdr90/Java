/**
 * 
 */
package es.pildoras.pruebasannotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Alex
 *
 */

@Component
//@Scope("prototype") // crea dos instancias diferentes en UsoAnnotations2

public class ComercialExperimentado implements Empleados {


	
	// ejecucion de codigo despues del bean
	@PostConstruct //necesario descargar javax/annotattio
	public void ejecutaDespuesCreacion() {
		System.out.println("Ejecutado despues del bean");
	}
	
	
	//ejecucion despues de apagado bean
	@PreDestroy
	public void ejecutaAntesDestruccion() {
		System.out.println("Ejecutando antes de la destruccion");
	}
	
	
	public ComercialExperimentado() {
		
		
	}
	
	/*@Autowired// Si solo definimos un constructor no es necesario, recomendado usar siempre
	public ComercialExperimentado(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}*/

	
	/*@Autowired
	public void NOIMPORTAELNOMBRE(CreacionInformeFinanciero nuevoInforme) {
		this.nuevoInforme = nuevoInforme;
	}*/

	
	
	@Override
	public String getTareas() {


		// TODO Auto-generated method stub
		return "Vender, vender y vender mas!!";
	}

	
	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		//return "Informe generado por el comercial";
	
		return nuevoInforme.getInformeFinanciero();
	
	}
	
	@Autowired // usamos reflexion
	@Qualifier("informeFinancieroTrim4") // bean que utilizaremos
	private CreacionInformeFinanciero nuevoInforme;
	
}
