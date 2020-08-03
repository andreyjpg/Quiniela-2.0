/*Integrantes 
    Andrey Pérez Granados
    David Fallas Morales
    Ericson Tames Quesada  

temas
    Base de datos: mysql
    SWING GUI
    Colecciones
    Excepciones
*/
package Exceptions;

public class PartidoIniciadoException extends Exception {
      public PartidoIniciadoException(){
        
    }
    @Override
    public String toString(){
        return "Advertencia - Algunos partidos se ecuentran inciados, para esos partidos no se admitiran cambios";
    }  
}
