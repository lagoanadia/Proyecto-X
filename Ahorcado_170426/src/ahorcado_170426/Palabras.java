
package ahorcado_170426;

import java.util.ArrayList;

public class Palabras
{
    ArrayList<String> palabras = new ArrayList<>();
public Palabras()
{
    palabras.add("gato");
    palabras.add("soplar");
    palabras.add("chorro");
    palabras.add("lavar");
    palabras.add("padre");
    palabras.add("sal");
    palabras.add("hueco");
    palabras.add("fiesta");
    palabras.add("perro");
    palabras.add("hamster");
    palabras.add("roer");
    palabras.add("papel");
  
}
    
    //Lista indexada de palabras
    public String escojerPalabraRandom(int siAleatoria)
    {
        //consultado en https://www.geeksforgeeks.org/java/getting-random-elements-from-arraylist-in-java/
       int index = (int)(Math.random()*palabras.size());
       String palabraRandom = palabras.get(index);
     return "palabraRandom";   
    }
    
   
}
