import javax.swing.*;

public class DividendoDivisor {
    public static void main ( String [ ] args ) {
        int n = Integer.parseInt(JOptionPane. showInputDialog ( "Introduce el dividendo (entero): " ));
        int m = Integer.parseInt(JOptionPane. showInputDialog ( "Introduce el divisor (entero): " ));
        System . out . println ( n + " entre " + m + " da un cociente " + ( ( int ) n ) / ( int ) m + " y un resto " + ( ( int ) n ) % ( int ) m ) ;
    }
}
