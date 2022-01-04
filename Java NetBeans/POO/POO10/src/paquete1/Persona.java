/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author Alex
 */
public class Persona {
   
    private final String nombre;
    private int edad;

    // constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

   public void mostrarDatos(){
       System.out.println("El nombre es "+nombre);
       System.out.println("La edad es "+edad);
   }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
   /*public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    */
}
