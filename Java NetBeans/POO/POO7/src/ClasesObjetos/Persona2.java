/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesObjetos;

/**
 *
 * @author Alex
 */
public class Persona2 {
    // atributos
    String nombre;
    int edad;
    String dni;
    // metodos

    public Persona2(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona2(String dni) {
        this.dni = dni;
    }
    
    public void correr(){
        System.out.println("Soy "+nombre+", tengo "+edad+" años y estoy "
                + "corrinedo la maraton de Madrid");
    }
    
    public void correr(int km){
        System.out.println("He corrido "+km+" km");   
    }
    
}
