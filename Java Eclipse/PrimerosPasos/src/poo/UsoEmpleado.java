/**
 * 
 */
package poo;
import java.util.*;
/**
 * @author Alex
 *
 */
public class UsoEmpleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*Empleado empleado1=new Empleado("Alex", 85000, 2022, 01, 01);
		Empleado empleado2=new Empleado("Juan", 95000, 2021, 02, 02);
		Empleado empleado3=new Empleado("Maria", 105000, 2019, 03, 03);
		
		empleado1.subeSueldo(5);
		empleado2.subeSueldo(5);
		empleado3.subeSueldo(5);
		
		System.out.println("Nombre: "+empleado1.dameNombre()+" Sueldo: "+empleado1.dameSueldo()
				+" Fecha de Alta: "+empleado1.dameFechaContrato());
		System.out.println("Nombre: "+empleado2.dameNombre()+" Sueldo: "+empleado2.dameSueldo()
		+" Fecha de Alta: "+empleado2.dameFechaContrato());
		System.out.println("Nombre: "+empleado3.dameNombre()+" Sueldo: "+empleado3.dameSueldo()
		+" Fecha de Alta: "+empleado3.dameFechaContrato());*/
		
		Jefatura jefe_RRHH=new Jefatura("Alejandro", 285000, 2032, 01, 01);
		jefe_RRHH.estableceIncentivo(2570);
		
		Empleado[] misEmpleados=new Empleado[6];
		misEmpleados[0]=new Empleado("Alex", 85000, 2022, 01, 01);
		misEmpleados[1]=new Empleado("Juan", 95000, 2021, 02, 02);
		misEmpleados[2]=new Empleado("Maria", 105000, 2020, 03, 03);
		misEmpleados[3]=new Empleado("Paco");
		misEmpleados[4]=jefe_RRHH;// POLIFORMISMO EN ACCION. PRINCIPIO DE SUBSTITUCION.
		misEmpleados[5]=new Jefatura("Gonzalo", 195000, 1999, 5, 26);// dame.Sueldo es el de jefatura
		
		Jefatura jefe_Finanzas=(Jefatura) misEmpleados[5];// casting de objetos
		jefe_Finanzas.estableceIncentivo(55000);
		//Jefatura jefe_compras=(Jefatura) misEmpleados[1];// un empleado no es siempre un jefe
		
		/*for(int i=0;i<3;i++) {
			misEmpleados[i].subeSueldo(5);
		}
		
		for(int i=0;i<3;i++) {
			System.out.println("Nombre: "+misEmpleados[i].dameNombre()
					+" Sueldo: "+misEmpleados[i].dameSueldo()
					+" Fecha de alta: "+misEmpleados[i].dameFechaContrato());
		}*/
		
		// for each
		for(Empleado e: misEmpleados) {
			e.subeSueldo(5);
		}
		for(Empleado e: misEmpleados) {
			System.out.println("Nombre: "+e.dameNombre()
					+" Sueldo: "+e.dameSueldo()
					+" Fecha de alta: "+e.dameFechaContrato());
		}

	}

}


class Empleado{
	
	public Empleado(String nom, double sue, int agno, int mes, int dia) {
	
		nombre=nom;
		sueldo=sue;
		GregorianCalendar calendario= new GregorianCalendar(agno, mes-1, dia);
		altaContrato=calendario.getTime();
		
		
	}
	
	// sobrecarga de constructores
	public Empleado(String nom) {
		this(nom, 30000, 2000, 01, 01);// darle siemrpre valores por defecto
	}
	
	public String dameNombre() {// getter
		return nombre;
	}
	
	public double dameSueldo() {// getter
		return sueldo;
	}
	
	public Date dameFechaContrato() {// getter
		return altaContrato;
	}
	
	public void subeSueldo(double porcentaje) {// setter
		double aumento=sueldo*porcentaje/100;
		sueldo+=aumento;
	}
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	
}



class Jefatura extends Empleado{
	public Jefatura(String nom, double sue, int agno, int mes, int dia) {
		super(nom, sue, agno, mes, dia);
	}
	
	public void estableceIncentivo(double b) {
		incentivo=b;
	}
	public double dameSueldo() {
		double sueldoJefe=super.dameSueldo();
		return sueldoJefe+incentivo;
	}
	
	private double incentivo;

	
	/*class Director extends Jefatura{
	
		public Director(String nom, double sue, int agno, int mes, int dia) {
			super(nom,sue,agno,mes,dia);
		}
	}*/
	
	
}









