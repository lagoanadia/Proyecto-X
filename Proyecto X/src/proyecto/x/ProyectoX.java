
package proyecto.x;

import java.util.Scanner;
import java.util.ArrayList;
public class ProyectoX {

    
    public static void main(String[] args) {
        
        int cantidadUsuarios = 0;
        String respuestaNombreUsuario = "";
        int respuestaAsignarTarea = 0;
        Scanner scInt = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);
        
       
  // USUARIOS 
        //Usuario prueba
        Usuario usuarioPrueba = new Usuario("Nadia");
  
        System.out.println("Cuantos usuarios hai en la vivienda?"); 
        cantidadUsuarios = scInt.nextInt();
        
        
        // Se crea una lista indefinidia de usuarios.
        ArrayList<Usuario> ListaUsuarios = new ArrayList<>();
        ListaUsuarios.add(usuarioPrueba);
       
        //Se crean nuevos Usuarios y se les asignan nombres mediante un Scanner
        //adaptar el valor de i en base a cuantos usuarios existan.
            int añadir = 0;
            if(ListaUsuarios.size()==0)
            {
                añadir++;
            }else
            {  
               añadir = añadir+2;  
               System.out.println("Ya existe/n "+ListaUsuarios.size()+" usuario/s!");
            
            }
            
        for(int i = 0; i< cantidadUsuarios; i++)
        {
            System.out.println("Como se llama el Usuario numero "+(i + añadir));
            respuestaNombreUsuario = scString.nextLine();
            
            //Creamos nuevos usuarios asignandole a la vez un nombre gracias al constructor de la clase.
            Usuario usuarioNuevo = new Usuario(respuestaNombreUsuario);
            //Añadimos el usuario recien creado a la Lista de Usuarios. 
            ListaUsuarios.add(usuarioNuevo);
        }
        //Devolver lista de usuarios con sus nombres.
        for(Usuario usuarioNuevo : ListaUsuarios)
        {
            System.out.println(usuarioNuevo.getNombreUsuario());
        }
// TAREAS
       
        
        //Se crea una lista indefinida de Tareas.
        ArrayList<Tarea> ListaTareas = new ArrayList<>();
        
         //Tarea prueba
        Tarea tareaPrueba = new Tarea ("tareaPrueba", false, null);
        ListaTareas.add(tareaPrueba);
        
        //Prueba de asignacion de tarea a usuario de prueba 
        tareaPrueba.usuarioAsignado = usuarioPrueba;
        
        
        
        
        //Se crean 4 tareas aleatorias de prueba y se añaden a la lista de tareas.
        for(int l=0; l<2; l++)
        {
          Tarea tareaNueva = new Tarea("Tarea "+(l+2), false, null);
          ListaTareas.add(tareaNueva);
          
        }
        
        //Devuelve todas las tareas activas.
       for(Tarea tareaNueva : ListaTareas)
       {
           System.out.println(tareaNueva.getNombreTarea());
       }
       
       //Se crea una lista para tareas que aún no han sido asignadas a ningun usuario.
       ArrayList<Tarea> TareasSinAsignar = new ArrayList<>();
       
           for(Tarea tareaNueva : ListaTareas)
           {
                if(tareaNueva.usuarioAsignado == null)
                {
                     TareasSinAsignar.add(tareaNueva);
                }
            }
         
        System.out.println("Hai "+TareasSinAsignar.size()+" tareas sin asignar.");
       
        System.out.println("Si deseas asignar las tareas pendientes pulsa 1 si no pulsa 0");
        respuestaAsignarTarea = scInt.nextInt();
        
        if( respuestaAsignarTarea == 1)
        {
           for(Tarea tareaNueva : TareasSinAsignar)
           {
              System.out.println("A que Usuario te gustaria asignar la tarea "+tareaNueva.getNombreTarea());
              
           }
        }  
    }
    
}
