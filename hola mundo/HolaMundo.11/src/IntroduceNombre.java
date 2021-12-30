import javax.swing.*;

public class IntroduceNombre {

    public static String nombre () {
        String nombre = JOptionPane.showInputDialog("Introduce tu nombre: ");
        System.out.println("¡Hola " + nombre + "!");
        return nombre;
    }
}