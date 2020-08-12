/*Integrantes 
    Andrey Pérez Granados
    David Fallas Morales
*/
package Exceptions;

public class InicioSesionException extends Exception{
    public InicioSesionException(){
        
    }
    
    @Override
    public String toString(){
        return "ERROR - Los datos ingresados no son correctos";
    }
}
