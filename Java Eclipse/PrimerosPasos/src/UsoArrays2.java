import javax.swing.JOptionPane;

/**
 * 
 */

/**
 * @author Alex
 *
 */
public class UsoArrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*String [] paises1= new String[8];
		
		paises[0]="Espa?a";
		paises[1]="Italia";
		paises[2]="Portugal";
		paises[3]="Islandia";
		paises[4]="Grecia";
		paises[5]="Mexico";
		paises[6]="Argentina";
		paises[7]="Irlandia";*/
		
		/*for(int i=0;i<paises.length;i++) {
		System.out.println("Pais "+(i+1)+" "+paises1[i]);
		}*/
		
		//String [] paises2= {"Alemania","Japon", "Uruguay","Finlandia"};
		
		/*for(String elementos:paises2) {
			System.out.println("Pais: "+elementos);
		}*/
		
		String [] paises3= new String[4];
		
		for(int i=0;i<4;i++) {
			paises3[i]=JOptionPane.showInputDialog("Introduce pais"+(i+1));
		}
		
		for(String elementos:paises3) {
			System.out.println("Pais: "+elementos);
		}
		
	}

}
