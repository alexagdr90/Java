
public class ManipulacionCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre="Alex";
		
		System.out.println("Mi nombre es: "+nombre);
		System.out.println("Mi nombre tine: "+nombre.length()+" letras.");
		System.out.println("La primera letra de "+nombre+" es la "+nombre.charAt(0));
		
		// valido para cualquier nombre
		int ultima_letra;
		ultima_letra=nombre.length();
		
		System.out.println("Y la ultima letra es: "+ nombre.charAt(ultima_letra-1));

	}

}
