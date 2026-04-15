
package proyecto.x;
import java.util.ArrayList;

public class Usuario {
    String nombre;
    ArrayList<Tarea> tareaAsignada;
    
    public Usuario(String nombre){
        this.nombre = nombre;
    }
   // El usuario creado por defecto no tendra ninguna tarea asignada por lo que el campo sera null 
      public Usuario(){
        this.nombre = "Usuario Nuevo";
        this.tareaAsignada = null;
    }
    public String getNombreUsuario(){
         return nombre;
}
    //metodo para asignarle una tarea a un usuario 
    public void setTarea(String nombre, ArrayList<Tarea> tareaAsignada){
        this.nombre = nombre;
        this.tareaAsignada = tareaAsignada;
    }
}
    
