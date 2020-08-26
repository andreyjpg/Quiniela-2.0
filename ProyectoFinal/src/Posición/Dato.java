/*Integrantes 
    Andrey Pérez Granados
    David Fallas Morales
 */
package Posición;

public class Dato {
    private int idUsuario;
    private String nombre;
    private int puntaje;
    
    public Dato(){
        this.nombre = "";
        this.puntaje = 0;
    }
    
    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    public String getNombre() {
        return nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }
    
        
}
