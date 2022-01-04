
package herencia;

/**
 *
 * @author Alex
 */
public class Estudiante extends Persona{
    private int codigoEstudiante;
    private float notaFinal;

    // constructor
    public Estudiante(int codigoEstudiante, float notaFinal, 
            String nombre, String apellido, int edad) {
        super(nombre, apellido, edad);
        this.codigoEstudiante = codigoEstudiante;
        this.notaFinal=notaFinal;
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: "+getNombre()+
                "\nApellido: "+getApellido()+
                "\nCodigo Estudiante: "+codigoEstudiante+
                        "\nNota Final: "+notaFinal);
    }
    
    
}
