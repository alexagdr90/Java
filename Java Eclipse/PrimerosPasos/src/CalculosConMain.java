
public class CalculosConMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//double raiz=Math.sqrt(7);
		//System.out.println(raiz);
	
		float num1=5.44f;
		int r=Math.round(num1);
		System.out.println(r);
		
		double num2=8.44;
		int k=(int)Math.round(num2);
		System.out.println(k);
		
		double base=5;
		double exponente=3;
		int resultado=(int)Math.pow(base, exponente);
		System.out.println("El resultado es: "+resultado);
	}

}
