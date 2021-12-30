import java.util.Scanner;

public class IndiceMasa {
    private static Object peso;

    public static int peso ( ) {
        Scanner scan = new Scanner( System . in ) ;
        int estatura = scan . nextInt ( ) ;
        int imc = (int) Math . round ( ( double ) peso / ( double ) estatura * ( double ) estatura );
        System . out . println ( "Tu índice de masa corporal es " + imc ) ;
        return imc ;
    }
}
