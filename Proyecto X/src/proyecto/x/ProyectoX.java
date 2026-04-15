
package proyecto.x;

import java.util.Scanner;
import java.util.ArrayList;
public class ProyectoX {

    
    public static void main(String[] args) {
        int respuesta = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantos usuarios hai en la vivienda?"); 
        respuesta = sc.nextInt();
        sc.nextLine();
        ArrayList<Usuario> ListaUsuarios = new ArrayList<>();
       
        for(int i = 0; i< respuesta; i++){
            
            System.out.println("como se llama");
            String respuestanombre = sc.nextLine();
            Usuario u = new Usuario("Usuario"+i+":"+respuestanombre);
            
            
            ListaUsuarios.add(u);
        }
        
        for(Usuario u : ListaUsuarios){
            System.out.print(u.getNombreUsuario()+" ");
        }

        ArrayList<Tarea> ListaTareas = new ArrayList<>();
            for(int k =0; k<respuestaTareas; k++){
               String nombreTarea = sc.nextLine();
               Tarea t = new Tarea("tarea "+k+" "+nombreTarea);
               ListaTareas.add(t);
                
            }
        
        for(Tarea t: ListaTareas){
            System.out.println(t.getNombreTarea()+" ");
        }
        
        
    }
    
}
