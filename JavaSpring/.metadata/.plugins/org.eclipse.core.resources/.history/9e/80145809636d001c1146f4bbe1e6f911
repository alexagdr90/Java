/**
 * 
 */
package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.JdbcUpdateAffectedIncorrectNumberOfRowsException;

/**
 * @author Alex
 *
 */
public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		// cracion de objetos de tipo empleado
		
		Empleados Empleado1=new DirectorEmpleado();
		
		// uso de los objetos creados
		
		System.out.println(Empleado1.getTareas());
*/
	
		ClassPathXmlApplicationContext contexto= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		DirectorEmpleado Alejandro=contexto.getBean("miEmpleado", DirectorEmpleado.class);
		
		System.out.println(Alejandro.getTareas());
		System.out.println(Alejandro.getInforme());
		
		System.out.println(Alejandro.getEmail());
		System.out.println(Alejandro.getNombreEmpresa());
		
		
		
		/*SecretarioEmpleado Maria=contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado Pablo=contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		System.out.println(Maria.getTareas());
		System.out.println(Maria.getInforme());
		System.out.println("Email: "+Maria.getEmail());
		System.out.println("La empresa es: "+Maria.getNombreEmpresa());
		
		System.out.println("Email de Pablo: "+Pablo.getEmail());
*/
		
		contexto.close();
		
		

	
	}

}









