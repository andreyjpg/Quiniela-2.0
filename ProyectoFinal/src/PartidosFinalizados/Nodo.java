/*Integrantes 
    Andrey Pérez Granados
    David Fallas Morales
 */
package PartidosFinalizados;
import PartidosCreados.Dato;
/**
 *
 * @author Andrey
 */
public class Nodo {
    private Dato dato;
    private Nodo siguiente;
    
    public Nodo() {
        siguiente = null;
    }

    public Dato getDato() {
        return dato;
    }

    public void setDato(Dato dato) {
        this.dato = dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    
    
}
