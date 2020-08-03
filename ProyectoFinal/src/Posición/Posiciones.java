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
package Posición;


public class Posiciones {
    private String nombre;
    private int puntaje;
    
    public Posiciones(String nombre, int puntos){
        this.nombre = nombre;
        puntaje = puntos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }
    
    
}
