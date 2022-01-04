
package ejemplo;

/**
 *
 * @author Alex
 */
public class Main {
    
    public static void main(String[] args) {
        
        Planta planta=new Planta();
        AnimalCarnivoro animalCarnivoro=new AnimalCarnivoro();
        AnimalHerbivoro animalHerbivoro=new AnimalHerbivoro();
        
        
        planta.alimentarse();
        animalCarnivoro.alimentarse();
        animalHerbivoro.alimentarse();
                
                
    }
    
    
}
