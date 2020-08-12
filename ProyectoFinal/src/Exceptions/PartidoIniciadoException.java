/*Integrantes 
    Andrey Pérez Granados
    David Fallas Morales
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
