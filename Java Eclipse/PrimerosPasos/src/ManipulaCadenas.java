
public class ManipulaCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String frase="Hoy es un estupendo dia para aprender a programar en Java.";
		
		String frase_resumen=frase.substring(29, 58);
		String frase2_resumen=frase.substring(0, 29) + "irnos a la playa.";

		System.out.println(frase_resumen);
		System.out.println(frase2_resumen);
		
	}

}
