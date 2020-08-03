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

public class InicioSesionException extends Exception{
    public InicioSesionException(){
        
    }
    
    @Override
    public String toString(){
        return "ERROR - Los datos ingresados no son correctos";
    }
}
