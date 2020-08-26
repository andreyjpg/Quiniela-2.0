/*Integrantes 
    Andrey Pérez Granados
    David Fallas Morales
 */
package PartidosCreados;

public class NodoCola {
    
    private Dato dato;
    private NodoCola siguiente;
    
    public NodoCola(){
        this.dato=null;
        this.siguiente=null;
    }

    public Dato getDato() {
        return dato;
    }

    public void setDato(Dato dato) {
        this.dato = dato;
    }

    public NodoCola getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCola siguiente) {
        this.siguiente = siguiente;
    }
     
}
