import java.util.*;
public class AdivinarNumero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Math.random()*100);
		
		int aleatorio=(int)(Math.random()*100);
		System.out.println(aleatorio);
		
		int aleatorio2=(int)(Math.random()*100);
		Scanner entrada=new Scanner(System.in);
		
		int numero=0;
		int intentos=0;
		
		while(numero!=aleatorio){
			intentos++;
			System.out.println("Introduce un numero del 1 al 100, por favor: ");
			numero=entrada.nextInt();
			
			if(aleatorio<numero) {
				System.out.println("Mas bajo");
			}else if(aleatorio>numero) {
				System.out.println("Mas alto");
			}
		}
		System.out.println("Correcto, lo has conseguido en "+intentos+" intentos.");

	}

}
