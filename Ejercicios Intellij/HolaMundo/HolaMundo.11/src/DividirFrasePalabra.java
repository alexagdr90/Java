import java.util.Scanner;

public class DividirFrasePalabra {
    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        //Hace que podamos escribir espacios en la frase y coja todo el String
        sn.useDelimiter("\n");

        System.out.println("Escribe una frase: ");
        String frase=sn.next();

        //Divido la frase en palabras
        String palabras[] = frase.split(" ");

        for(int i=0;i<palabras.length;i++){
            System.out.println(palabras[i]);
        }

    }
}
