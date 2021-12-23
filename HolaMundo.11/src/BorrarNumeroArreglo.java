import java.util.Scanner;

public class BorrarNumeroArreglo {
    public static void main(String[] args) {
        int array[] = new int[10];
        int posicion;
        Scanner scanner = new Scanner(System.in);
        // Se leen los 10 numeros
        for (int i = 0; i < 10; i++) {
            System.out.println("Elemento ("+i+"): ");
            array[i] = scanner.nextInt();
        }
        System.out.println();
        //Lee la posicion que interesa
        //Suponemos posicion entre 0 - 9
        System.out.println("Posicion a eliminar: ");
        posicion = scanner.nextInt();
        //desplazamos hasta el final todos los elementos
        //si el elemento esta en la posicion se borra
        for (int i = posicion; i<9; i++){
            array[i] = array[i+1];
        }
        System.out.println("El array queda: ");
        for (int i = posicion; i<9; i++){
            System.out.println(array[i]);
        }
    }
}
