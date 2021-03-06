/**
 * 
 */
package poo;

/**
 * @author Alex
 *
 */
public class Coche2 {


	private int ruedas;
	private int largo;
	private int ancho;
	private int motor;
	private int peso;
	private int peso_plataforma;
	private String color;
	private int peso_total;
	private boolean asientos_cuero, climatizador;
	
	public Coche2() {
		ruedas=4;
		largo=200;
		ancho=300;
		motor=1600;
		peso=500;
		peso_plataforma=500;
	}
	/*
	//getter -> indicamos dato a devolver + return obligatorio
	public String dime_ruedas() {
		return("Este coche tiene "+ruedas+" ruedas.");
	}*/
	public String dime_datos_generale() {
		return("La plataforma del vehiculo tiene "+ruedas+" ruedas"+
		". Mide "+largo/100+" metros, con un ancho de " +ancho+ 
		" cm y un peso de "+peso_plataforma+" kg");
	}
	
	//setter -> no devuelve dato, solo modifica el dato
	public void establece_color(String color_coche) {
		//color="azul";
		color=color_coche;
	}
	
	public String dime_color() {
		return("El color del coche es "+color);
	}
	
	//configurar asientos
	
	public void configura_asientos(String asientos_cuero) {// setter
		if(asientos_cuero.equalsIgnoreCase("si")) {
			this.asientos_cuero=true;
		}else {
			this.asientos_cuero=false;
		}
	}
	public String dime_asientos() {// getter
		if(asientos_cuero==true) {
			return("El coche tiene asientos de cuero.");
		}else {
			return "El coche tiene asientos de serie.";
		}
	}
	
	//configurar climatizador
	
	public void configura_climatizador(String climatizador) {// setter
		if(climatizador.equalsIgnoreCase("si")) {
			this.climatizador=true;
		}else {
			this.climatizador=false;
		}
	}
	public String dime_climatizador() {// getter
		if(climatizador==true) {
			return "El coche tiene climatizador";
		}else {
			return "El coche tiene aire acondicionado";
		}
	}
	
	// setter y getter juntos, no recomendado
	
	public String dime_peso_coche() {
		int peso_carroceria=500;
		peso_total=peso_plataforma+peso_carroceria;
		
		if(asientos_cuero==true) {
			peso_total=peso_total+50;
		}
		if(climatizador==true){
			peso_total=peso_total+20;
		}
		return "El peso del coche es "+peso_total+" kg";
	}
	
	// precio del coche
	
	public int dime_precio_coche() {// getter
		int precio_final=10000;
		
		if(asientos_cuero==true) {
			precio_final+=2000;
		}
		if(climatizador==true){
			precio_final+=1500;
		}
		return precio_final;
	}
}


