
package ahorcado_170426;
import java.util.Arrays;
import java.util.Scanner;

public class Ahorcado_170426 {

   
    public static void main(String[] args) {
    
    
    Scanner sc = new Scanner(System.in);
      String respuesta="";
      char letra;
      int siAleatoria=0;
      
      String nombreU;
     
      System.out.println("Introduce el nombre del usuario");
      nombreU = sc.nextLine();
      Usuario U1 = new Usuario(nombreU, 5);
      Palabras P1 = new Palabras();
      System.out.println("Quieres escribirla a mano o que el sistema escoja una palabra aleatoria");
      siAleatoria = sc.nextInt();
      switch (siAleatoria){
          case 1:
                P1.escojerPalabraRandom(siAleatoria);
                char[]respuestaIndexada = palabraRandom.toCharArray();
                Juego j1 = new Juego(respuestaIndexada, false); 
                 System.out.println(Arrays.toString(j1.crearOculta()));
                break;
          case 2: 
                System.out.println ("Escribe una palabra");
                respuesta = sc.nextLine();
                char[]respuestaIndexada = respuesta.toCharArray();
                Juego j1 = new Juego(respuestaIndexada, false); 
                 System.out.println(Arrays.toString(j1.crearOculta()));
       break;
      }
      
      
    while(U1.vida>0 && !j1.salir)
    {
      System.out.println("Introduce una letra");
      letra = sc.next().charAt(0);
      System.out.println("Vidas : "+U1.cambiarVida(j1.comprobarLetra(letra), j1.detectarRepetidas(letra))+" "+letra+ " es " +j1.comprobarLetra(letra));
      System.out.println(Arrays.toString(j1.mostrarOculta()));
      j1.siAcabado();
    }  
     
          
      
    }
    
}
