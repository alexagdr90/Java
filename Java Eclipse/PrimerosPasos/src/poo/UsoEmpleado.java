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
		System.out.println("El jefe "+jefe_Finanzas.dameNombre()+" tiene un bonus de "+
		jefe_Finanzas.establece_bonus(500));
		System.out.println(misEmpleados[3].dameNombre()+" tine un bonus de "+misEmpleados[3].establece_bonus(200));
		/*for(int i=0;i<3;i++) {
			misEmpleados[i].subeSueldo(5);
		}
		
		for(int i=0;i<3;i++) {
			System.out.println("Nombre: "+misEmpleados[i].dameNombre()
					+" Sueldo: "+misEmpleados[i].dameSueldo()
					+" Fecha de alta: "+misEmpleados[i].dameFechaContrato());
		}*/
		
		/*Empleado director_comercial=new Jefatura("Sandra",85000,2009,12,12);
		Comparable ejemplo=new Empleado("Elisa",95000,2015,04,04);
		
		if(director_comercial instanceof Empleado) {
			System.out.println("Es de tipo Jefatura");
		}
		if(ejemplo instanceof Comparable) {
			System.out.println("Implementa la interfaz Comparable");
		}*/
		
		//ordenar
		Arrays.sort(misEmpleados);
		
		System.out.println(jefe_Finanzas.tomar_decisiones("Dar mas dias de vacaciones a los empleados"));
		
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


class Empleado implements Comparable, Trabajadores{
	
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
	
	public int compareTo(Object miObjeto) {
		Empleado otroEmpleado=(Empleado) miObjeto;
		
		if(this.sueldo<otroEmpleado.sueldo) {
			return -1;
		}
		if(this.sueldo<otroEmpleado.sueldo) {
			return 1;
		}
		return 0;
	
	}
	
	private String nombre;
	private double sueldo;
	private Date altaContrato;
	@Override
	public double establece_bonus(double gratificacion) {
		// TODO Auto-generated method stub
		return Trabajadores.bonus_base+gratificacion;
	}
	
}



class Jefatura extends Empleado implements Jefes{
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

	@Override
	public String tomar_decisiones(String decision) {
		// TODO Auto-generated method stub
		return "Un miembro de la direccion a tomado la decision: "+decision;
	}

	@Override
	public double establece_bonus(double gratificacion) {
		// TODO Auto-generated method stub
		
		double prima=2000;
		return Trabajadores.bonus_base+gratificacion+prima;
	}

	
	/*class Director extends Jefatura{
	
		public Director(String nom, double sue, int agno, int mes, int dia) {
			super(nom,sue,agno,mes,dia);
		}
	}*/
	
	
}









