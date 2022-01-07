/**
 * 
 */
package es.pildoras.pruebasannotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Alex
 *
 */
public class UsoAnnotations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// leer el xml de configuracion
		ClassPathXmlApplicationContext contexto= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		// pedir el bin bean
		
		Empleados Antonio=contexto.getBean("comercialExperimentado",Empleados.class);
		
		
		// uso el bean
		
		System.out.println(Antonio.getInforme());
		System.out.println(Antonio.getTareas());
		
		// cerrar el contexto
		
		contexto.close();
		
		
		
	}

}
