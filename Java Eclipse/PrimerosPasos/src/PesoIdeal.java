import javax.swing.*;
public class PesoIdeal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String genero="";
		
		do {
			genero=JOptionPane.showInputDialog("Introduce tu genero (H/M)");
		}while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);{
			int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura en cm"));
			int pesoideal=0;
			if(genero.equalsIgnoreCase("H")) {
				pesoideal=altura-100;
			}else if(genero.equalsIgnoreCase("M"));{
				pesoideal=altura-110;
			}
			
			System.out.println("Tu peso ideal es "+pesoideal+" kg");
			
		}
		
	}

}
