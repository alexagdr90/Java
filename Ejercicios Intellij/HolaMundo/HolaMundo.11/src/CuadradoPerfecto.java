import java.util.Scanner;

public class CuadradoPerfecto {
        public static void main(String[] args)
        {
            int input = 0; //Valor por defecto
            Scanner keyboard = new Scanner(System.in);
            while (input != -1)
            {
                System.out.println("Ingrese un número o ingrese -1 para salir.");
                input = keyboard.nextInt();
                if (esPerfecto(input) == true) //Llame a esPerfecto() para determinar si es un cuadrado perfecto
                {
                    System.out.println(input + " Es un cuadrado perfecto.");
                }
                else if(input == -1) //Si es igual al código de salida, saldra.
                {
                    System.out.println("Break!");
                    break;
                }
                else //Si no es un cuadrado perfecto
                {
                    System.out.println(input + " No es un cuadrado perfecto.");
                }

            }
            System.out.println("Programa terminado!");
        }

        public static boolean esPerfecto(int input)
        {
            int num = ((int)Math.sqrt(input)); //Saca la raíz cuadrada

            if (num*num == input){ //Si el número pasado = sus raíces Y no tiene resto, debe ser un cuadrado perfecto
                return true;
            }
            else
            {
                return false;
            }
        }

}
