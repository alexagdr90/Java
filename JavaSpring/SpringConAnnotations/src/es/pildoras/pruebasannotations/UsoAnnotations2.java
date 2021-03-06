/**
 * 
 */
package es.pildoras.pruebasannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.annotation.IfProfileValue;

/**
 * @author Alex
 *
 */
public class UsoAnnotations2 {
	
	public static void main(String[] args) {
		

	// leer el xml de configuracion
			//ClassPathXmlApplicationContext contexto= new ClassPathXmlApplicationContext("applicationContext.xml");
	
		
	//	leer el class de configuracion
		
		AnnotationConfigApplicationContext contexto=new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		
	// pedir el bin bean al contenedor
	
			/*Empleados Antonio=contexto.getBean("comercialExperimentado",Empleados.class);
			
			Empleados Lucia=contexto.getBean("comercialExperimentado",Empleados.class);

	// ?apunta al mismo objeto en memoria?
	
			if(Antonio==Lucia) {
				System.out.println("Apuntan al mismo lugar de memoria");
				System.out.println(Antonio+"\n"+Lucia);
			}else {
				System.out.println("NO apunta al mismo lugar de memoria");
				System.out.println(Antonio+"\n"+Lucia);

			}*/
	
			
		
		// pedir el bean al contenedor
	
		/*Empleados empleados=contexto.getBean("directorFinanciero", Empleados.class);
		
		System.out.println(empleados.getTareas());
		System.out.println(empleados.getInforme());
		*/
		
		DirectorFinanciero empleado=contexto.getBean("directorFinanciero", DirectorFinanciero.class);
		System.out.println("Email del director: "+empleado.getEmail());
		System.out.println("Nombre de la empresa: "+empleado.getNombreEmpresa());
		// cerrar el contexto
			
			contexto.close();
			
	}
	
	
}