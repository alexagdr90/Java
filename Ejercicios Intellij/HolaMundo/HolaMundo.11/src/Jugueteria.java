import javax.swing.*;

public class Jugueteria {
    public static void main(String[] args) {
        pesoPayaso();
    }
    public static int pesoPayaso ( ) {
        int pesoPayaso = 112 ;
        int pesoMuñeca = 75 ;
        int payasos = Integer . parseInt ( JOptionPane . showInputDialog ( "Introduce el número de payasos a enviar: " ) ) ;
        int muñecas = Integer . parseInt ( JOptionPane. showInputDialog ( "Introduce el número de muñecas a enviar: " ) ) ;
        int pesoTotal = pesoPayaso * payasos + pesoMuñeca * muñecas ;
        System . out . println ( "El peso total del paquete es " + pesoTotal ) ;
        return pesoTotal ;
    }
}
