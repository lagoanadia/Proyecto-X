
package ahorcado_170426;


public class Usuario {
    
  int vida;
    String nombre;
 
public Usuario(String nombre, int vida)
{
    this.nombre = nombre;
    this.vida = vida;
    
}

public int cambiarVida(boolean coincide, boolean repetida)
{
    if(!coincide&&!repetida)
    {
        vida--;
    }
    return vida;
}


}
