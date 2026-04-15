
package proyecto.x;

public class Tarea {
  String nombreTarea;
  boolean asignada;
  Usuario usuarioAsignado;
  
   public Tarea (){
      nombreTarea="Nueva Tarea";
      asignada=false;
      usuarioAsignado= null;
  } 
  public Tarea (String nombre, boolean asignada, Usuario usuarioAsignado){
      this.nombreTarea = nombre;
      this.asignada = asignada;
      this.usuarioAsignado = usuarioAsignado;
  }
  
  public String getNombreTarea(){
      return nombreTarea;
  }
  // Si el campo usuario es null el campo asignada sera falso dando a entender que no dicha tarea aun no ha sido asignada.
  public boolean siAsignada(Usuario usuario){
      if( this.usuarioAsignado == null ){
          asignada = false;
      } else{ asignada = true;
      
      
  
      }
      return asignada;
  }
}

  
