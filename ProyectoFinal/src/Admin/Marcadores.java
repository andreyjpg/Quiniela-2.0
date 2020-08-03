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
package Admin;

public class Marcadores {
    private Object idUsuario;
    private int puntos;
    
    public Marcadores(int id, int puntos ){
        this.idUsuario = id;
        this.puntos = puntos;
    }

    public Object getIdUsuario() {
        return idUsuario;
    }

    public int getPuntos() {
        return puntos;
    }
  
    
}
