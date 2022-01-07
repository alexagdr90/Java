/**
 * 
 */
package es.pildoras.pruebasannotations;

import org.springframework.context.annotation.Bean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.*;
/**
 * @author Alex
 *
 */

@Configuration
@ComponentScan("es.pildoras.pruebasannotations")
@PropertySource("classpath:datosEmpresa.propiedades")
public class EmpleadosConfig {

	// definir el bean para InformeFinancieroDtoCompras
	
	@Bean
	public CreacionInformeFinanciero informeFinancieroDtoCompras() {// sera el id del bean inyectado
		
		return new InformeFinancieroDtoCompras();
		
	}
	
	
	// definir el bean para DirectorFinanciero e inyectar dependencias
	
	@Bean
	public Empleados directorFinaciero() {
		
		return new DirectorFinanciero(informeFinancieroDtoCompras());
	}
	
	
	
}
