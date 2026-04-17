
package ahorcado_170426;

import java.util.ArrayList;
import java.util.Arrays;
public class Juego {
    private char[] palabra;
    private char[] palabraOculta;
     boolean coincide;
     boolean salir;
     boolean repetida;



//Constructor agregando palabra de usuario
    public Juego(char[] palabra, boolean salir){
     this.palabra = palabra;
     this.salir = salir;
    }
 //Crear replica de la palabra adivinar ocultandola reemplazanado sus caracteres por huecos  
public char[] crearOculta()
{
    //establezco el largo de la palabra oculta igual al de la palabra a adivinar
    palabraOculta = new char[palabra.length];
    //relleno cada indice del array con un hueco
    for(int i=0; i<palabra.length; i++)
    {  
      palabraOculta[i] = '_';
    }
return palabraOculta ;
}

public boolean comprobarLetra(char letra)
{ coincide = false;
   for(int i =0; i<palabra.length;i++)
   {
       if(letra == palabra[i])
       {
           coincide = true;
           palabraOculta[i]=letra;
       }
   } 
   
    return coincide;
}


public char[] mostrarOculta()
{   
return palabraOculta ;
}

public boolean siAcabado()
{
   
   int contadorHuecos = 0;
    for(int i =0; i<palabra.length;i++)
   {
        
       if('_' == palabraOculta[i])
       {
           contadorHuecos ++;
       }      
   } 
   if(contadorHuecos == 0)
       {
           salir = true;
           System.out.println("Ganaste!");
       } else salir = false;
    
    return salir;
}
public boolean detectarRepetidas(char letra)
{
    repetida = false;
    for(int i=0; i<palabra.length;i++)
    {
        if(letra == palabraOculta[i])
        {
            repetida = true;
            letra = ' ';
        }
    }
    return repetida;
}



}
