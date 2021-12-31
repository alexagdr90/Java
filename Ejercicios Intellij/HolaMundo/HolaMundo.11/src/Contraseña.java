import javax.swing.*;

public class Contraseña {
    public static void main(String[] args) {

        String contraseña= "contraseña";

        final int INTENTOS = 3;

        //Esta variable booleana, nos controlara que en caso de que acierte la condicion cambie
        boolean acierto=false;

        String password;
        for (int i=0;i<3 && !acierto;i++){
            password= JOptionPane.showInputDialog("Introduce una contraseña");

            //Comprobamos si coincide, no usamos ==, usamos el metodo equals
            if (password.equals(contraseña)){
                System.out.println("Enhorabuena, acertaste");
                acierto=true;
            }else
                System.out.println("La contraseña es incorrecta");
        }
    }
}
