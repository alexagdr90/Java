import java.util.Scanner;

public class Mayor {
    public static void main(String[] args) {
        int array[] = new int[5];
        int mayor = array[0];
        Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese los 5 numeros: ");
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
                if (array[i] > mayor)
                {
                    mayor = array[i];
                }
                System.out.println("El numero mayor es: " +mayor);
                }
    }
}
