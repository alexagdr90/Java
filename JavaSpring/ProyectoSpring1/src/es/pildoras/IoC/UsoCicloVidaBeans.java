/**
 * 
 */
package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Alex
 *
 */
public class UsoCicloVidaBeans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// cargar el xml de configuracion
		
		ClassPathXmlApplicationContext contexto= new ClassPathXmlApplicationContext("applicationContext3.xml");

		// obtencio del bean
		
		Empleados alejandroEmpleados=contexto.getBean("miEmpleado", Empleados.class);
		System.out.println(alejandroEmpleados.getInforme());
		
		
		// cerrar el contexto
		
		contexto.close();
		
		
		
	}

}
