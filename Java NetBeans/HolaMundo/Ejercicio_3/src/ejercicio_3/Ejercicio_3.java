/*
Guillermo tiene N euros.
Luis tiene la mitad que tiene Guillermo.
Juan tiene la mitad de lo que poseen Luis y Guillermo juntos.
Hacer programa que calcule e imprima la cantidad de dinero que tienen entre los 3.
 */
package ejercicio_3;
import java.util.*;
/**
 *
 * @author Alex
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Scanner entrada=new Scanner(System.in);
        float guillermo,luis,juan,total;
        
        System.out.println("Digite la cantidad de dinero que tiene Guillermo ");
        guillermo=entrada.nextFloat();
        
        luis=guillermo/2;
        juan=(luis+guillermo)/2;
        total=juan+luis+guillermo;
        System.out.println("Guillermo tiene "+guillermo+" euros");
        System.out.println("Luis tiene "+luis+" euros");
        System.out.println("Juan tiene "+juan+" euros");
        System.out.println("En total tienen "+total+" euros");
        
        
        
        
    }
    
}
