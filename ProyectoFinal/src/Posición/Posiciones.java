/*Integrantes 
    Andrey Pérez Granados
    David Fallas Morales
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
