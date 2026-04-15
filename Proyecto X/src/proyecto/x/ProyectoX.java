
package proyecto.x;

import java.util.Scanner;
import java.util.ArrayList;
public class ProyectoX {

    
    public static void main(String[] args) {
        int respuesta = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos usuarios hai en la vivienda?"); 
        respuesta = sc.nextInt();
        ArrayList<Usuario> ListaUsuarios = new ArrayList<>();
        
        for(int i = 1; i<= respuesta; i++){
            Usuario u = new Usuario("Usuario"+i);
            ListaUsuarios.add(u);
        }
        
        for(Usuario u : ListaUsuarios){
            System.out.print(u.getNombreUsuario()+" ");
        }
        
        
    }
    
}
