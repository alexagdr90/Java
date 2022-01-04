/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClasesObjetos;

/**
 *
 * @author Alex
 */
public class Main {
    public static void main(String[] args) {
        Persona2 per=new Persona2("Alejandro",31);
        per.correr();
        
        Persona2 per2=new Persona2("Juan",21);
        per2.correr();
        per2.correr(42);            
         
    }
}
