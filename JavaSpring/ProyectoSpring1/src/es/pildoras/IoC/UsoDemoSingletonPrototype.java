/**
 * 
 */
package es.pildoras.IoC;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Alex
 *
 */
public class UsoDemoSingletonPrototype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// carga de XML de configuracion
		ClassPathXmlApplicationContext contexto= new ClassPathXmlApplicationContext("applicationContext2.xml");

		
		// peticiones de beans al contenedor Spring
		
		SecretarioEmpleado Maria=contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado Pablo=contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado Manolo=contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado Pedro=contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado Lucia=contexto.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);

		
		
		
		System.out.println(Maria);
		System.out.println(Pablo);
		System.out.println(Manolo);
		System.out.println(Pedro);
		System.out.println(Lucia);

		
		
		
		/*if(Maria==Pablo)System.out.println("Apuntan al mismo objeto");
		else System.out.println("No se trata del mismo objeto");
		*/
		
		
		
	}

}
