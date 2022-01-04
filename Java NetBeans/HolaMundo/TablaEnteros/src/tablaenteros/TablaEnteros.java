/*
Leer 10 enteros en 1 tabla
Guardar en otra tabla los enteros pares
A continuacion los impares
*/
package tablaenteros;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class TablaEnteros {

    public static void main(String[] args) {
        // TODO code application logic here
   
        Scanner entrada=new Scanner(System.in);
        int arreglo[]=new int[5];
        int cont_pares=0, cont_impares=0;
        
        
        System.out.println("Llenar el arreglo con 5 numeros");
        for(int i=0;i<5;i++){
            System.out.println((i+1)+". Digite un numero: ");
            arreglo[i]=entrada.nextInt();
            
            if(arreglo[i]%2==0){// si es par
                par[cont_pares]=arreglo[i];
                cont_pares++;
            }else{
                impar[cont_impares]=arreglo[i];
                cont_impares++;
            }
        
        }
        int par[]=new int[cont_pares];
        int impar[]=new int[cont_impares];
      
        System.out.println("Tabla de pares: ");
        for(int i=0;i<cont_pares;i++){    
            System.out.println(par[i]+"-");
        }
        System.out.println("");
        System.out.println("Tabla de impares: ");
        
        for(int i=0;i<cont_impares;i++){
            System.out.println(impar[i]+"-");
        }
             
        
        System.out.println("El total de pares es: "+par);
        System.out.println("El total de impares es: "+impar);
    
        }

}
   
