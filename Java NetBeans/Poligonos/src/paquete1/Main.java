
package paquete1;

import java.util.ArrayList;
import java.util.Scanner;
import org.xml.sax.SAXException;

/**
 *
 * @author Alex
 */
public class Main {
    
    static ArrayList<Poligono>poligono=new ArrayList<Poligono>();
    static Scanner entrada=new Scanner(System.in);
    
    
    public static void main(String[] args) {
        
        //Llenar poligono
        llenarpoligono();
        
        // mostrar los datos y el area de cada poligono
        mostrarResultados();
        
    }
    
    
    public static void llenarpoligono(){
        
            char respuesta;
            int opcion;
            
            do { 
                
                do {                    
                    System.out.println("Digite el poligono que desea: ");
                    System.out.println("1. Triangulo");
                    System.out.println("2. Rectangulo");
                    System.out.println("Opcion: "); 
                    opcion=entrada.nextInt();
                } while (opcion<1 || opcion>2);
                
                switch (opcion) {
                    case 1: llenarTriangulo();// llenar triangulo
                        break;
                    case 2: llenarRectangulo();// llenar rectangulo
                        break;
                }
                
                System.out.println("\n¿Desea introducir otro poligono? (s/n)");
                respuesta=entrada.next().charAt(0);
                System.out.println("");
            } while (respuesta=='s' || respuesta=='S');
    }
    
        
            public static void llenarTriangulo(){
                double lado1,lado2,lado3;
                System.out.println("Digite el lado 1 del Triangulo");
                lado1=entrada.nextDouble();
                System.out.println("Digite el lado 2 del Triangulo");
                lado2=entrada.nextDouble();
                System.out.println("Digite el lado 3 del Triangulo");
                lado3=entrada.nextDouble();
             
                
                Triangulo triangulo=new Triangulo(lado1, lado2, lado3, 3);
                
                // guardamos un triangulo en el arreglo
                poligono.add(triangulo);
            }
            
            
            public static void llenarRectangulo(){
                double lado1,lado2;
                
                System.out.println("Digite el lado 1 del rectangulo: ");
                lado1=entrada.nextDouble();
                System.out.println("Digite el lado 1 del rectangulo: ");
                lado2=entrada.nextDouble();

                Rectangulo rectangulo=new Rectangulo(lado1, lado2);
                
                poligono.add(rectangulo);
            }
    
            
            public static void mostrarResultados(){
                
                for (Poligono poligono1 : poligono) {
                    System.out.println(poligono1.toString());
                    System.out.println("Area= "+poligono1.area());
                }
                
            }
}
    
